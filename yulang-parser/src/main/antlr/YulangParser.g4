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