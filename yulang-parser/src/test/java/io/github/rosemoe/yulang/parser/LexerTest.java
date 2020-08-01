package io.github.rosemoe.yulang.parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.util.Scanner;

public class LexerTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter content:");
        YulangLexer lexer = new YulangLexer(CharStreams.fromString(in.nextLine(), "test"));
        for (Token token : lexer.getAllTokens()) {
            System.out.println(token);
        }
    }

}
