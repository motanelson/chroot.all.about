grammar cpp;

// ==========================
// Entrada principal
// ==========================
compilationUnit
    : (declaration 
     | functionDeclaration
     | functionDefinition 
     | classDefinition)* EOF
    ;

// ==========================
// Declarações
// ==========================
declaration
    : typeSpecifier initDeclaratorList ';'
    ;

initDeclaratorList
    : initDeclarator (',' initDeclarator)*
    ;

initDeclarator
    : declarator ('=' expression)?
    ;

functionDeclaration
    : typeSpecifier qualifiedIdentifier '(' parameterList? ')' ';'
    ;

typeSpecifier
    : ('unsigned' | 'signed')? ('int' | 'float' | 'char' | 'void' | 'double' | 'bool')
    | Identifier
    ;

declarator
    : ('*' | '&')* Identifier ('[' IntegerConstant ']')*
    ;

// ==========================
// Funções
// ==========================
functionDefinition
    : typeSpecifier qualifiedIdentifier '(' parameterList? ')' compoundStatement
    ;

parameterList
    : parameter (',' parameter)*
    ;

parameter
    : typeSpecifier declarator
    ;

// ==========================
// Classes
// ==========================
classDefinition
    : 'class' Identifier '{' classMember* '}' ';'
    ;

classMember
    : declaration
    | functionDefinition
    | functionDeclaration
    | constructor
    | destructor
    ;

constructor
    : Identifier '(' parameterList? ')' compoundStatement
    ;

destructor
    : '~' Identifier '(' parameterList? ')' compoundStatement
    ;

// ==========================
// Statements
// ==========================
compoundStatement
    : '{' statement* '}'
    ;

statement
    : expressionStatement
    | compoundStatement
    | selectionStatement
    | iterationStatement
    | jumpStatement
    | declaration
    ;

expressionStatement
    : expression? ';'
    ;

selectionStatement
    : 'if' '(' expression ')' statement ('else' statement)?
    ;

iterationStatement
    : 'while' '(' expression ')' statement
    | 'for' '(' (declaration | expressionStatement) expression? ';' expression? ')' statement
    ;

jumpStatement
    : 'return' expression? ';'
    ;

// ==========================
// Expressões
// ==========================
expression
    : conditionalExpression
    ;

conditionalExpression
    : logicalOrExpression ('?' expression ':' conditionalExpression)?
    ;

assignmentExpression
    : logicalOrExpression (assignmentOperator assignmentExpression)?
    ;

assignmentOperator
    : '=' | '+=' | '-=' | '*=' | '/=' | '%='
    ;

logicalOrExpression
    : logicalAndExpression ('||' logicalAndExpression)*
    ;

logicalAndExpression
    : bitwiseOrExpression ('&&' bitwiseOrExpression)*
    ;

bitwiseOrExpression
    : bitwiseXorExpression ('|' bitwiseXorExpression)*
    ;

bitwiseXorExpression
    : bitwiseAndExpression ('^' bitwiseAndExpression)*
    ;

bitwiseAndExpression
    : equalityExpression ('&' equalityExpression)*
    ;

equalityExpression
    : relationalExpression (('==' | '!=') relationalExpression)*
    ;

relationalExpression
    : additiveExpression (('<' | '>' | '<=' | '>=') additiveExpression)*
    ;

additiveExpression
    : multiplicativeExpression (('+' | '-') multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression (('*' | '/' | '%') unaryExpression)*
    ;

// ==========================
// Unary / Postfix
// ==========================
unaryExpression
    : ('+' | '-' | '!' | '++' | '--') unaryExpression
    | postfixExpression
    ;

postfixExpression
    : primaryExpression ('++' | '--')*
    ;

// ==========================
// Primary
// ==========================
primaryExpression
    : 'this'
    | qualifiedIdentifier ('(' argumentList? ')')? ('.' Identifier)*
    | Constant
    | StringLiteral
    | '(' expression ')'
    ;

qualifiedIdentifier
    : Identifier ('::' Identifier)*
    ;

argumentList
    : expression (',' expression)*
    ;

// ==========================
// Tokens Léxicos
// ==========================
Identifier
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

// Constantes
Constant
    : IntegerConstant
    | FloatingConstant
    | CharacterConstant
    ;

IntegerConstant
    : [0-9]+
    ;

FloatingConstant
    : [0-9]+ '.' [0-9]* (('e' | 'E') ('+' | '-')? [0-9]+)?
    ;

CharacterConstant
    : '\'' ( ~['\\] | '\\' . ) '\''
    ;

StringLiteral
    : '"' ( ~["\\] | '\\' . )* '"'
    ;

// ==========================
// Espaços e comentários
// ==========================
Whitespace
    : [ \t\r\n]+ -> skip
    ;

LineComment
    : '//' ~[\r\n]* -> skip
    ;

BlockComment
    : '/*' .*? '*/' -> skip
    ;
