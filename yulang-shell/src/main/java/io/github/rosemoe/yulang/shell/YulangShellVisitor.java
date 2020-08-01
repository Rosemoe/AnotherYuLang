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

import io.github.rosemoe.yulang.parser.YulangParser;
import io.github.rosemoe.yulang.parser.YulangParserVisitor;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.reflect.Array;
import java.util.List;

import static io.github.rosemoe.yulang.shell.YulangExecuteContext.checkCondition;

public class YulangShellVisitor implements YulangParserVisitor<Void> {

    private final YulangShell host;
    private final YulangExecuteContext context;

    public YulangShellVisitor(YulangExecuteContext context, YulangShell host) {
        this.context = context;
        this.host = host;
    }

    @Override
    public Void visitStatements(YulangParser.StatementsContext ctx) {
        for (YulangParser.StatementContext statementContext : ctx.statement()) {
            if (context.shouldNotExecute()) {
                break;
            }
            statementContext.accept(this);
        }
        return null;
    }

    @Override
    public Void visitStatement(YulangParser.StatementContext ctx) {
        if (context.shouldNotExecute()) {
            return null;
        }
        if(ctx.breakStatement != null) {
            context.breakLoop();
            return null;
        }
        if(ctx.endcodeStatement != null) {
            context.stopExecute();
            return null;
        }
        ctx.getChild(0).accept(this);
        return null;
    }

    @Override
    public Void visitBlockStatement(YulangParser.BlockStatementContext ctx) {
        ctx.statements().accept(this);
        return null;
    }

    @Override
    public Void visitAssignmentStatement(YulangParser.AssignmentStatementContext ctx) {
        context.setValueFor(ctx.variantType().start, ctx.name.getText(), context.getValueForExpression(ctx.expression(), false));
        return null;
    }

    @Override
    public Void visitVariantType(YulangParser.VariantTypeContext ctx) {
        return null;
    }

    @Override
    public Void visitModuleFunctionCallStatement(YulangParser.ModuleFunctionCallStatementContext ctx) {
        if (context.shouldNotExecute()) {
            return null;
        }
        try {
            String functionName = ctx.functionCall().name.getText();
            // Lazily set text cache for later invocation
            if(ctx.functionCall().name instanceof CommonToken) {
                ((CommonToken) ctx.functionCall().name).setText(functionName);
            }
            String moduleName = ctx.moduleName.getText();
            if(ctx.moduleName instanceof  CommonToken) {
                ((CommonToken) ctx.moduleName).setText(moduleName);
            }
            YulangModule module = host.getFunctionManager().resolveModule(moduleName);
            if (module == null) {
                throw new YulangExecuteException("can not find such module: " + positionDescribe(ctx));
            }
            YulangCallable callable = module.resolve(functionName, ctx.functionCall().argumentList().getChildCount());
            if (callable == null) {
                throw new YulangExecuteException("can not find such function in module '" + moduleName + "': " + positionDescribe(ctx.functionCall()));
            }
            callable.invoke(context, ctx.functionCall().argumentList().argument(), ctx.functionCall().blockStatement());
        } catch (Exception e) {
            if(e instanceof YulangExecuteException) {
                throw e;
            }
            throw new YulangExecuteException(positionDescribe(ctx.functionCall()), e);
        }
        return null;
    }

    @Override
    public Void visitFunctionCallStatement(YulangParser.FunctionCallStatementContext ctx) {
        if (context.shouldNotExecute()) {
            return null;
        }
        try {
            String functionName = ctx.functionCall().name.getText();
            // Lazily set text cache for later invocation
            if(ctx.functionCall().name instanceof CommonToken) {
                ((CommonToken) ctx.functionCall().name).setText(functionName);
            }
            YulangCallable callable = host.getFunctionManager().resolve(functionName, ctx.functionCall().argumentList().getChildCount());
            if (callable == null) {
                throw new YulangExecuteException("can not find such function: " + positionDescribe(ctx.functionCall()));
            }
            List<YulangParser.ArgumentContext> arguments = ctx.functionCall().argumentList().argument();
            callable.invoke(context, arguments, ctx.functionCall().blockStatement());
        } catch (Exception e) {
            if(e instanceof YulangExecuteException) {
                throw e;
            }
            throw new YulangExecuteException(positionDescribe(ctx.functionCall()), e);
        }
        return null;
    }

    @Override
    public Void visitIfStatement(YulangParser.IfStatementContext ctx) {
        if (checkCondition(context.getValueForExpression(ctx.condition, false))) {
            ctx.statement().accept(this);
        } else {
            for (YulangParser.ElseIfLabelContext elseIfLabelContext : ctx.elseIfLabel()) {
                if (checkCondition(context.getValueForExpression(elseIfLabelContext.expression(), false))) {
                    elseIfLabelContext.statement().accept(this);
                    return null;
                }
            }
            YulangParser.ElseLabelContext elseLabel = ctx.elseLabel();
            if (elseLabel != null) {
                elseLabel.statement().accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visitWhileStatement(YulangParser.WhileStatementContext ctx) {
        context.enterLoop();
        try {
            while ((checkCondition(context.getValueForExpression(ctx.expression(), false)))) {
                if (context.shouldNotExecute()) {
                    break;
                }
                ctx.statement().accept(this);
            }
        } finally {
            context.exitLoop();
        }
        return null;
    }

    @Override
    public Void visitForStatement(YulangParser.ForStatementContext ctx) {
        context.enterLoop();
        try {
            Object leftValue = context.getValueForExpression(ctx.expression(0), false);
            Object targetValue = context.getValueForExpression(ctx.expression(1), false);
            if (targetValue == null) {
                return null;
            }
            if (targetValue instanceof Number) {
                long min = 0;
                if (leftValue instanceof Number) {
                    min = ((Number) leftValue).longValue();
                }
                long max = ((Number) targetValue).longValue();
                for (long i = min; i <= max; i++) {
                    if (context.shouldNotExecute()) {
                        break;
                    }
                    ctx.statement().accept(this);
                }
            } else if (targetValue instanceof Object[]) {
                Object[] targetArray = (Object[]) targetValue;
                int size = targetArray.length;
                if (isAssignable(ctx.expression(0))) {
                    YulangParser.ExpressionContext expr = ctx.expression(0);
                    for (int i = 0; i < size; i++) {
                        if (context.shouldNotExecute()) {
                            break;
                        }
                        assignTo(expr, targetArray[i]);
                        ctx.statement().accept(this);
                    }
                } else {
                    for (int i = 0; i < size; i++) {
                        if (context.shouldNotExecute()) {
                            break;
                        }
                        ctx.statement().accept(this);
                    }
                }
            } else if (targetValue.getClass().isArray()) {
                int size = Array.getLength(targetValue);
                if (isAssignable(ctx.expression(0))) {
                    YulangParser.ExpressionContext expr = ctx.expression(0);
                    for (int i = 0; i < size; i++) {
                        if (context.shouldNotExecute()) {
                            break;
                        }
                        assignTo(expr, Array.get(targetValue, i));
                        ctx.statement().accept(this);
                    }
                } else {
                    for (int i = 0; i < size; i++) {
                        if (context.shouldNotExecute()) {
                            break;
                        }
                        ctx.statement().accept(this);
                    }
                }
            } else if (targetValue instanceof Iterable) {
                YulangParser.ExpressionContext expr = ctx.expression(0);
                boolean assignable = isAssignable(expr);
                for (Object val : ((Iterable<?>) targetValue)) {
                    if (context.shouldNotExecute()) {
                        break;
                    }
                    if (assignable) {
                        assignTo(expr, val);
                    }
                    ctx.statement().accept(this);
                }
            }
        } finally {
            context.exitLoop();
        }
        return null;
    }

    public void assignTo(YulangParser.ExpressionContext expression, Object obj) {
        YulangParser.ReadableVariantContext readableVariantContext = expression.primaryExpression().readableVariant();
        context.setValueFor(readableVariantContext.variantType() == null ? null : readableVariantContext.start, readableVariantContext.IDENTIFIER().getText(), obj);
    }

    public static boolean isAssignable(YulangParser.ExpressionContext expression) {
        return (expression.primaryExpression() != null && expression.primaryExpression().readableVariant() != null);
    }

    //-----Unsupported---------------------------------------

    @Override
    public Void visitElseIfLabel(YulangParser.ElseIfLabelContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitElseLabel(YulangParser.ElseLabelContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitFunction(YulangParser.FunctionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitFunctionCall(YulangParser.FunctionCallContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitModule(YulangParser.ModuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitFunctions(YulangParser.FunctionsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitParameterList(YulangParser.ParameterListContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitParameter(YulangParser.ParameterContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitExpression(YulangParser.ExpressionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitPrimaryExpression(YulangParser.PrimaryExpressionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitReadableVariant(YulangParser.ReadableVariantContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitArgumentList(YulangParser.ArgumentListContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitArgument(YulangParser.ArgumentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visit(ParseTree tree) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitChildren(RuleNode node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitTerminal(TerminalNode node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Void visitErrorNode(ErrorNode node) {
        System.err.println("Error node found in input tree at" + positionDescribe(node));
        return null;
    }

    protected static String positionDescribe(ParserRuleContext context) {
        return "line " + context.start.getLine() + " column " + context.start.getCharPositionInLine() + " in file " + context.start.getTokenSource().getSourceName() + ":" + context.getText();
    }

    protected static String positionDescribe(ErrorNode node) {
        return "line " + node.getSymbol().getLine() + " column " + node.getSymbol().getCharPositionInLine() + " in file " + node.getSymbol().getTokenSource().getSourceName() + ":" + node.getText();
    }
}
