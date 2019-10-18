grammar Unilang;

IDENTIFIER: ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')+;
EQ: '=';
SQB_O: '[';
SQB_C: ']';
PAR_O: '(';
PAR_C: ')';
COMMA: ',';
DOT: '.';
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
VLINE: '|';
EXCLAMATION: '!';
INTEGER: ('+' | '-')? '0'..'9'+;
DOUBLE: INTEGER DOT ('0'..'9')+;

WS: [ \n\t\r]+ -> channel(HIDDEN);
COMMENT : SLASH STAR .*? STAR SLASH -> skip;
LINE_COMMENT : SLASH SLASH ~[\r\n]* -> skip;

start:
    statement+
    ;

statement:
    assignment
    ;

assignment:
    identifier EQ expr |
    identifier PLUS EQ expr |
    identifier MINUS EQ expr |
    identifier STAR EQ num_expr
    ;

identifier:
    IDENTIFIER |
    IDENTIFIER SQB_O list_elem SQB_C
    ;

expr:
    parenthesis_expr |
    list_expr |
    num_expr |
    ;

parenthesis_expr:
    PAR_O expr PAR_C
    ;

list_expr:
    identifier |
    SQB_O SQB_C |
    SQB_O list_elem (COMMA list_elem)* SQB_C |
    list_expr PLUS list_expr |
    list_expr MINUS list_expr |
    list_expr STAR num_expr
    ;

list_elem:
    expr |
    range_expr
    ;

range_expr:
    num_expr DOT DOT num_expr
    ;

num_expr:
    identifier |
    r_integer |
    r_double
    ;

r_integer:
    INTEGER
    ;

r_double:
    DOUBLE
    ;

