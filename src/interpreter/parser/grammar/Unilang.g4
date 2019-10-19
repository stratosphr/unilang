grammar Unilang;

DOUBLE_QUOTE_STRING: UNTERMINATED_DOUBLE_QUOTE_STRING '"';
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

start:
    instrs
    ;

instrs:
    instr*
    ;

instr:
    PRINT expr #Print |
    PRINTLN expr #PrintLn
    ;

expr:
    SIMPLE_QUOTE_STRING #String |
    DOUBLE_QUOTE_STRING #String |
    expr (PLUS expr)+ #Plus
    ;
