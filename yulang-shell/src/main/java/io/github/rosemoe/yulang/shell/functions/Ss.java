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

package io.github.rosemoe.yulang.shell.functions;

import io.github.rosemoe.yulang.parser.YulangParser;
import io.github.rosemoe.yulang.shell.YulangCallable;
import io.github.rosemoe.yulang.shell.YulangExecuteContext;

import java.util.List;

public class Ss implements YulangCallable {

    public final static Ss INSTANCE = new Ss();

    @Override
    public int getArgumentCount() {
        return 2;
    }

    @Override
    public void invoke(YulangExecuteContext context, List<YulangParser.ArgumentContext> arguments, YulangParser.BlockStatementContext attachedStatement) {
        if (YulangCallable.isAssignable(arguments.get(0).expression())) {
            YulangCallable.assignTo(context, arguments.get(0).expression(), context.getValueForExpression(arguments.get(1).expression(), false));
        }
    }

}