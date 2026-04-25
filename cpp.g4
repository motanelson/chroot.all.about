grammar cpp;

// ==========================
// Entrada principal
// ==========================
compilationUnit
    : (declaration 
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
    | coutStatement
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

coutStatement
    : 'cout' ('<<' expression)+ ';'
    ;

// ==========================
// Expressões (Hierarquia de Precedência)
// ==========================
expression
    : assignmentExpression
    ;

assignmentExpression
    : conditionalExpression (assignmentOperator assignmentExpression)?
    ;

assignmentOperator
    : '=' | '+=' | '-=' | '*=' | '/=' | '%='
    ;

conditionalExpression
    : logicalOrExpression ('?' expression ':' conditionalExpression)?
    ;

logicalOrExpression
    : logicalAndExpression ('||' logicalAndExpression)*
    ;

logicalAndExpression
    : equalityExpression ('&&' equalityExpression)*
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

unaryExpression
    : ('+' | '-' | '!' | '++' | '--') unaryExpression
    | postfixExpression
    ;

postfixExpression
    : primaryExpression
    | postfixExpression '(' argumentList? ')'
    | postfixExpression '[' expression ']'
    | postfixExpression '.' Identifier
    | postfixExpression '++'
    | postfixExpression '--'
    ;

primaryExpression
    : 'this'
    | Constant
    | StringLiteral
    | '(' expression ')'
    | qualifiedIdentifier
    ;

qualifiedIdentifier
    : ('::')? Identifier ('::' Identifier)*
    ;

argumentList
    : expression (',' expression)*
    ;

// ==========================
// Tokens Léxicos
// ==========================
Identifier : [a-zA-Z_] [a-zA-Z0-9_]* ;
Constant   : [0-9]+ ('.' [0-9]*)? ;
StringLiteral : '"' ( ~["\\] | '\\' . )* '"' ;
Whitespace : [ \t\r\n]+ -> skip ;
LineComment : '//' ~[\r\n]* -> skip ;
BlockComment : '/*' .*? '*/' -> skip ;