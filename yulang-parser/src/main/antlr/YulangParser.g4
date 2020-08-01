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
    : assignmentStatement
    | functionCallStatement
    | moduleFunctionCallStatement
    | ifStatement
    | whileStatement
    | forStatement
    | blockStatement
    | breakStatement='break'
    | endcodeStatement='endcode'
    ;

blockStatement
    : '{' statements '}'
    ;

assignmentStatement
    : variantType name=IDENTIFIER EQ expression
    ;

variantType
    : LOCAL
    | CONTEXT
    | GLOBAL
    ;

expression
    : '(' expression ')'
    | primaryExpression
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
    | STRING
    ;

readableVariant
    : (variantType '.')? IDENTIFIER
    ;

moduleFunctionCallStatement
    : moduleName=IDENTIFIER '.' functionCall
    ;

functionCallStatement
    : functionCall
    ;

functionCall
    : name=IDENTIFIER '(' argumentList ')' blockStatement?
    ;

argumentList
    : argument? (',' argument)*
    ;

argument
    : expression
    ;

ifStatement
    : IF '(' condition=expression ')' statement elseIfLabel* elseLabel?
    ;

elseIfLabel
    : ELSE IF '(' expression ')' statement
    ;

elseLabel
    : ELSE statement
    ;

whileStatement
    : WHILE '(' expression ')' statement
    ;

forStatement
    : FOR '(' expression ';' expression ')' statement
    ;