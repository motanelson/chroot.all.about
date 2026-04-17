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
    : typeSpecifier declarator ('=' expression)? ';'
    ;

functionDeclaration
    : typeSpecifier Identifier '(' parameterList? ')' ';'
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
    : typeSpecifier Identifier '(' parameterList? ')' compoundStatement
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
    : assignmentExpression
    ;

assignmentExpression
    : logicalOrExpression ('=' assignmentExpression)?
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

// 🔥 suporte completo a ++ e --
unaryExpression
    : ('+' | '-' | '!' | '++' | '--') unaryExpression
    | postfixExpression
    ;

postfixExpression
    : primaryExpression ('++' | '--')*
    ;

// 🔥 chamadas de função + acesso a membros
primaryExpression
    : Identifier ('(' argumentList? ')')? ('.' Identifier)*
    | Constant
    | StringLiteral
    | '(' expression ')'
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

// 🔥 char com escape
CharacterConstant
    : '\'' ( ~['\\] | '\\' . ) '\''
    ;

// 🔥 strings
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