/*
 *    Copyright 2020 Rosemoe
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.github.rosemoe.yulang.shell;

import io.github.rosemoe.yulang.parser.YulangLexer;
import io.github.rosemoe.yulang.parser.YulangParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

import static io.github.rosemoe.yulang.parser.YulangLexer.*;

public class YulangExecuteContext {

    private static final Map<Integer,Map<String,Object>> sessionVariableMaps;

    private static final Map<String,Object> globalVariables;

    static {
        globalVariables = new ConcurrentHashMap<>();
        sessionVariableMaps = new ConcurrentHashMap<>();
    }

    public synchronized static Map<String,Object> getSessionVariableMap(int session) {
        Map<String,Object> map = sessionVariableMaps.get(session);
        if(map == null) {
            map = new ConcurrentHashMap<>();
            sessionVariableMaps.put(session, map);
        }
        return map;
    }

    public static Map<String, Object> getGlobalVariableMap() {
        return globalVariables;
    }

    private final int session;
    private YulangShell declaringHost;
    private final Map<String,Object> sessionVariables;
    private final Map<String,Object> localVariables;
    private final Stack<BoolHolder> loopStateStack = new Stack<>();
    private boolean stopFlag = false;

    static class BoolHolder {
        boolean value;
        BoolHolder() {
            value = false;
        }
    }

    /**
     * Create a empty context with the given session
     * @param session Session for variable management
     */
    public YulangExecuteContext(int session) {
        sessionVariables = getSessionVariableMap(session);
        localVariables = new HashMap<>();
        this.session = session;
    }

    /**
     * Create a new context from the given context
     * @param context The source context.Can not be null
     */
    public YulangExecuteContext(YulangExecuteContext context) {
        this(context, true, true);
    }

    public YulangExecuteContext(YulangExecuteContext context, boolean copyLocalVariables, boolean copyStack) {
        this(context.getSession());
        if(copyLocalVariables) {
            localVariables.putAll(context.localVariables);
        }
        declaringHost = context.declaringHost;
    }

    public int getSession() {
        return session;
    }

    protected void setDeclaringHost(YulangShell declaringInterpreter) {
        this.declaringHost = declaringInterpreter;
    }

    public YulangShell getDeclaringHost() {
        return declaringHost;
    }

    public void setValueFor(Token prefix, String name, Object value) {
        if (prefix == null) {
            localVariables.put(name, value);
            return;
        }
        switch (prefix.getType()) {
            case YulangLexer.LOCAL:
                localVariables.put(name, value);
            case YulangLexer.CONTEXT:
                sessionVariables.put(name, value);
            case YulangLexer.GLOBAL:
                globalVariables.put(name, value);
        }
    }

    protected void enterLoop() {
        loopStateStack.push(new BoolHolder());
    }

    protected void breakLoop() {
        loopStateStack.peek().value = true;
    }

    protected void exitLoop() {
        loopStateStack.pop();
    }

    protected boolean shouldNotExecute() {
        return stopFlag || (!loopStateStack.empty() && loopStateStack.peek().value);
    }

    protected void stopExecute() {
        stopFlag = true;
    }

    public Object getValueFor(Token prefix, String name) {
        if (prefix == null) {
            return localVariables.get(name);
        }
        switch (prefix.getType()) {
            case YulangLexer.LOCAL:
                return localVariables.get(name);
            case YulangLexer.CONTEXT:
                return sessionVariables.get(name);
            case YulangLexer.GLOBAL:
                return globalVariables.get(name);
        }
        return null;
    }

    public Object getValueForExpression(YulangParser.ExpressionContext expression, boolean enableNumberPlus) {
        if (expression.operator == null) {
            YulangParser.PrimaryExpressionContext primary = expression.primaryExpression();
            if(primary != null) {
                if (primary.readableVariant() != null) {
                    YulangParser.ReadableVariantContext readableVariantContext = primary.readableVariant();
                    Token token = readableVariantContext.variantType() == null ? null : readableVariantContext.variantType().start;
                    String name = readableVariantContext.IDENTIFIER().getText();
                    return getValueFor(token, name);
                } else if(primary.TRUE() != null) {
                    return true;
                } else if(primary.FALSE() != null) {
                    return false;
                } else if(primary.NUMBER() != null) {
                    return Long.parseLong(primary.NUMBER().getText());
                } else if(primary.STRING() != null) {
                    return decodeString(primary.STRING().getText());
                } else {
                    return null;
                }
            } else {
                return getValueForExpression(expression.expression(0), enableNumberPlus);
            }
        } else {
            switch (expression.operator.getType()) {
                case ANDAND:
                    return checkCondition(getValueForExpression(expression.expression(0), enableNumberPlus)) && checkCondition(getValueForExpression(expression.expression(1), enableNumberPlus));
                case OROR:
                    return checkCondition(getValueForExpression(expression.expression(0), enableNumberPlus)) || checkCondition(getValueForExpression(expression.expression(1), enableNumberPlus));
            }
            Object leftValue = getValueForExpression(expression.expression(0), enableNumberPlus);
            Object rightValue = getValueForExpression(expression.expression(1), enableNumberPlus);
            try {
                switch (expression.operator.getType()) {
                    case EQEQ:
                        return toString(leftValue).equals(toString(rightValue));
                    case NOTEQ:
                        return !toString(leftValue).equals(toString(rightValue));
                    case STARTSWITH:
                        return toString(leftValue).startsWith(toString(rightValue));
                    case ENDSWITH:
                        return toString(leftValue).endsWith(toString(rightValue));
                    case CONTAINS:
                        return toString(leftValue).contains(toString(rightValue));
                    case LT:
                        return toLong(leftValue) < toLong(rightValue);
                    case LTEQ:
                        return toLong(leftValue) <= toLong(rightValue);
                    case GT:
                        return toLong(leftValue) > toLong(rightValue);
                    case GTEQ:
                        return toLong(leftValue) >= toLong(rightValue);
                }
            }catch (NumberFormatException e) {
                return false;
            }
            try {
                switch (expression.operator.getType()) {
                    case MINUS:
                        return toLong(leftValue) - toLong(rightValue);
                    case MULTI:
                        return toLong(leftValue) * toLong(rightValue);
                    case DIV:
                        return toLong(leftValue) / toLong(rightValue);
                    case PLUS:
                        if (enableNumberPlus) {
                            try {
                                return toLong(leftValue) + toLong(rightValue);
                            } catch (NumberFormatException e) {
                                return toString(leftValue) + toString(rightValue);
                            }
                        } else {
                            if (leftValue instanceof Number && rightValue instanceof Number) {
                                return ((Number) leftValue).longValue() + ((Number) rightValue).longValue();
                            }
                            return toString(leftValue) + toString(rightValue);
                        }
                }
            } catch (NumberFormatException e) {
                return null;
            }
            return null;
        }
    }

    private static String decodeString(String string) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i < string.length() - 1;i++) {
            if(string.charAt(i) == '\\') {
                char next = string.charAt(i + 1);
                if(next == 'n') {
                    sb.append('\n');
                }else {
                    sb.append(next);
                }
                i++;
            }else {
                sb.append(string.charAt(i));
            }
        }
        return sb.toString();
    }

    public static boolean checkCondition(Object target) {
        if (target instanceof Boolean) {
            return ((Boolean) target);
        } else {
            return target != null;
        }
    }

    public static String toString(Object target) {
        if (target instanceof String) {
            return (String)target;
        } else {
            return target == null ? "null" : target.toString();
        }
    }

    public static long toLong(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        } else {
            return Long.parseLong(toString(obj));
        }
    }

}
