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
import io.github.rosemoe.yulang.parser.YulangParser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.io.*;
import java.util.BitSet;
import java.util.Objects;

public class YulangShell {

    private final YulangFunctionManager functionManager;

    public YulangShell() {
        functionManager = new YulangFunctionManager();
    }

    public void eval(Reader reader, String name, YulangExecuteContext context) throws IOException {
        YulangLexer lexer = new YulangLexer(CharStreams.fromReader(reader, name));
        YulangParser parser = new YulangParser(new CommonTokenStream(lexer));
        parser.addErrorListener(new ANTLRErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new YulangExecuteException("failed to recognize code:" + recognizer.getErrorHeader(e), e);
            }

            @Override
            public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {

            }

            @Override
            public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {

            }

            @Override
            public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {

            }
        });
        eval(parser.statements(), context);
    }

    public void eval(String source, String name, YulangExecuteContext context) {
        YulangLexer lexer = new YulangLexer(CharStreams.fromString(source, name));
        YulangParser parser = new YulangParser(new CommonTokenStream(lexer));
        parser.addErrorListener(new ANTLRErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new YulangExecuteException("failed to recognize code:" + recognizer.getErrorHeader(e), e);
            }

            @Override
            public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {

            }

            @Override
            public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {

            }

            @Override
            public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {

            }
        });
        eval(parser.statements(), context);
    }

    public void eval(StatementsContext statements, YulangExecuteContext context) {
        Objects.requireNonNull(statements);
        if (context.getDeclaringHost() != null) {
            throw new IllegalStateException("context is unavailable");
        }
        context.setDeclaringHost(this);
        YulangShellVisitor visitor = new YulangShellVisitor(context, this);
        statements.accept(visitor);
    }

    public YulangFunctionManager getFunctionManager() {
        return functionManager;
    }

}
