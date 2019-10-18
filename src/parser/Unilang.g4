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
    instr_print
    ;

instr_print:
    PRINT expr |
    PRINTLN expr
    ;

expr:
    SIMPLE_QUOTE_STRING |
    DOUBLE_QUOTE_STRING |
    expr PLUS expr
    ;

