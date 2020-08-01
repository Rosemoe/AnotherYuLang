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

public class RunTest {

    public static void main(String[] args) {
        YulangShell yulangShell = new YulangShell();
        String source = "s a=1\n" +
                "syso(a)\n" +
                "s b = a * 2\n" +
                "syso(b)\n" +
                "for(1;10) {\n" +
                "s b = b * 2" +
                "syso(b)" +
                "f(b > 500) break" +
                "}";
        yulangShell.eval(source, "test", new YulangExecuteContext(114514));
    }

}
