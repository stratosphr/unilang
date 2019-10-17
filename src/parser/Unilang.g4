grammar Unilang;

IDENTIFIER : ('a'..'z' | 'A'..'Z' | '_')+;
EQ : '=';
SQB_O : '[';
SQB_C : ']';

WS: [ \n\t\r]+ -> skip;

start :
    IDENTIFIER EQ list_expr
    ;

list_expr:
    SQB_O SQB_C // []
    ;