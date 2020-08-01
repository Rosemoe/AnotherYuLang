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

import java.util.List;

public interface YulangCallable {

    static boolean isAssignable(YulangParser.ExpressionContext expression) {
        return YulangShellVisitor.isAssignable(expression);
    }

    static void assignTo(YulangExecuteContext context, YulangParser.ExpressionContext assignableExpression, Object value) {
        YulangParser.ReadableVariantContext readableVariantContext = assignableExpression.primaryExpression().readableVariant();
        context.setValueFor(readableVariantContext.variantType() == null ? null : readableVariantContext.start, readableVariantContext.IDENTIFIER().getText(), value);
    }

    int getArgumentCount();

    void invoke(YulangExecuteContext context, List<YulangParser.ArgumentContext> arguments, YulangParser.BlockStatementContext attachedStatement);

}
