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
parser grammar YulangParser;

options { tokenVocab=YulangLexer; }

module
    : functions
    ;

functions
    : function*
    ;

function
    : FUNCTION name=IDENTIFIER '(' parameterList ')' statements END FUNCTION
    ;

parameterList
    : parameter? (',' parameter)*
    ;

parameter
    : name=IDENTIFIER
    ;

statements
    : statement*
    ;

statement
    : functionCallStatement
    | moduleFunctionCallStatement
    | assignmentStatement
    | ifStatement
    | whileStatement
    | forStatement
    | blockStatement
    ;

blockStatement
    : '{' statements '}'
    ;

assignmentStatement
    : type=('s' | 'ss' | 'sss') name=IDENTIFIER '=' expression
    ;

expression
    : primaryExpression
    | expression operator=('*' | '/') expression
    | expression operator=('+' | '-') expression
    | expression operator=('?*' | '*?' | '?' | '==' | '!=' | '<' | '>' | '<=' | '>=' | '||' | '&&') expression
    ;

primaryExpression
    : NUMBER
    | readableVariant
    | TRUE
    | FALSE
    | NULL
    ;

readableVariant
    : (type=('s' | 'ss' |'sss') '.')? IDENTIFIER
    ;

moduleFunctionCallStatement
    : moduleName=IDENTIFIER '.' functionCall
    ;

functionCallStatement
    : functionCall
    ;

functionCall
    : name=IDENTIFIER '(' argumentList ')'
    ;

argumentList
    : argument? (',' argument)*
    ;

argument
    : expression
    ;

ifStatement
    : IF '(' expression ')' statement (ELSE IF '(' expression ')' statement)* (ELSE statement)?
    ;

whileStatement
    : WHILE '(' expression ')' statement
    ;

forStatement
    : FOR '(' expression ';' expression ')' statement
    ;