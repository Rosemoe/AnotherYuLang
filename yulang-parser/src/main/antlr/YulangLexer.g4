lexer grammar YulangLexer;

IDENTIFIER:  Letter LetterOrDigit*;

//Prefixs
LOCAL:       's';
CONTEXT:     'ss';
GLOBAL:      'sss';

//Keywords
IF:          'f';
ELSE:        'else';
WHILE:       'while';
FOR:         'for';
FUNCTION:    'fn';
END:         'end';
ENDCODE:     'endcode';
BREAK:       'break';

//Constant literals
NUMBER:    ('0' | [1-9] (Digits? | '_'+ Digits));
STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"';
TRUE:        'true';
FALSE:       'false';
NULL:        'null';

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
EQ:                 '=';
EQEQ:               '==';
LT:                 '<';
LTEQ:               '<=';
GT:                 '>';
GTEQ:               '>=';
NOTEQ:              '!=';
STARTSWITH:         '?*';
ENDSWITH:           '*?';
CONTAINS:           '?';
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
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment HexDigit
    : [0-9a-fA-F]
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