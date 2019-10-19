grammar Unilang;

DOUBLE_QUOTE_STRING: UNTERMINATED_DOUBLE_QUOTE_STRING '"';
INTEGER: ('0' | '1'..'9'('0'..'9')*);
MINUS: '-';
PLUS: '+';
PRINT: 'print';
PRINTLN: 'printl' | 'println';
SIMPLE_QUOTE_STRING: UNTERMINATED_SIMPLE_QUOTE_STRING '\'';
SLASH: '/';
TIMES: '*';
UNTERMINATED_DOUBLE_QUOTE_STRING: ('"' (~["\\\r\n] | '\\' (. | EOF))*);
UNTERMINATED_SIMPLE_QUOTE_STRING: ('\'' (~['\\\r\n] | '\\' (. | EOF))*);

WS: [ \n\t\r]+ -> channel(HIDDEN);
COMMENT : SLASH TIMES .*? TIMES SLASH -> skip;
LINE_COMMENT : SLASH SLASH ~[\r\n]* -> skip;

ERROR: .;

program:
    instrs?
    ;

instrs:
    instr+
    ;

instr:
    PRINT expr #Print |
    PRINTLN expr #PrintLn
    ;

expr:
    SIMPLE_QUOTE_STRING #String |
    DOUBLE_QUOTE_STRING #String |
    INTEGER #Integer |
    expr (PLUS expr)+ #Plus
    ;
