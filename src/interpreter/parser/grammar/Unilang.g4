grammar Unilang;

C_BRA: ']';
C_PAR: ')';
COMMA: ',';
DIV: '/';
DOUBLE_QUOTE_STRING: UNTERMINATED_DOUBLE_QUOTE_STRING '"';
EQ: '=';
EXP: '^';
INTEGER: ('0' | '1'..'9'('0'..'9')*);
MINUS: '-';
O_BRA: '[';
O_PAR: '(';
PLUS: '+';
PRINT: 'print';
PRINTLN: 'printl' | 'println';
SIMPLE_QUOTE_STRING: UNTERMINATED_SIMPLE_QUOTE_STRING '\'';
TIMES: '*';
UNTERMINATED_DOUBLE_QUOTE_STRING: ('"' (~["\\\r\n] | '\\' (. | EOF))*);
UNTERMINATED_SIMPLE_QUOTE_STRING: ('\'' (~['\\\r\n] | '\\' (. | EOF))*);

IDENTIFIER: ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
WS: [ \n\t\r]+ -> channel(HIDDEN);
COMMENT : DIV TIMES .*? TIMES DIV -> skip;
LINE_COMMENT : DIV DIV ~[\r\n]* -> skip;

ERROR: .;

program:
    instrs?
    ;

instrs:
    instr+
    ;

instr:
    PRINT expr #Print |
    PRINTLN expr #PrintLn |
    IDENTIFIER EQ expr #Assignment
    ;

expr:
    SIMPLE_QUOTE_STRING #String |
    DOUBLE_QUOTE_STRING #String |
    IDENTIFIER #Identifier |
    INTEGER #Integer |
    O_BRA C_BRA #EmptyList |
    O_BRA expr (COMMA expr)* C_BRA #List |
    O_PAR expr C_PAR #Parenthesis |
    MINUS expr #UMinus |
    PLUS expr #UPlus |
    <assoc=right> expr EXP expr #Power |
    expr op=(TIMES | DIV) expr #TimesDiv |
    expr op=(PLUS | MINUS) expr #PlusMinus
    ;
