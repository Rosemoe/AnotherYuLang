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
 lexer grammar YulangLexer;

//Prefixs
LOCAL:       's';
CONTEXT:     'ss';
GLOBAL:      'sss';

//Keywords
IF:          'f';
ELSE:        'else';
WHILE:       'w';
FOR:         'for';
FUNCTION:    'fn';
END:         'end';
ENDCODE:     'endcode';
BREAK:       'break';

//Constant literals
NUMBER:    ('0' | [1-9] Digits?);
STRING:     '"' (~["\\\r\n] | EscapeSequence)* '"';
TRUE:        'true';
FALSE:       'false';
NULL:        'null';
IDENTIFIER:  Letter LetterOrDigit*;

//Separators
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
SEMI:               ';';
COMMA:              ',';
DOT:                '.';

//Operators
PLUS:               '+';
MINUS:              '-';
MULTI:              '*';
DIV:                '/';
EQEQ:               '==';
EQ:                 '=';
LTEQ:               '<=';
LT:                 '<';
GTEQ:               '>=';
GT:                 '>';
NOTEQ:              '!=';
STARTSWITH:         '?*';
CONTAINS:           '?';
ENDSWITH:           '*?';
ANDAND:             '&&';
OROR:               '||';

//Whitespace
WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);

//Comments
LINE_COMMENT:       ('//' | ([\n\r] '.')) ~[\r\n]*    -> channel(HIDDEN);
COMMENT:            '/.' .*? './'    -> channel(HIDDEN);

//Fragments
fragment EscapeSequence
    : '\\' [btnfr"'\\]
    ;
fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;
fragment LetterOrDigit
    : Letter
    | [0-9]
    ;
fragment Letter
    : [a-zA-Z$_] // these are the "java letters" below 0x7F
    | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
    ;