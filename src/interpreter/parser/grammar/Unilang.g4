grammar Unilang;

AND: '&&';
ARROW_LEFT: '<-';
ARROW_RIGHT: '->';
BINARY_AND: '&';
BINARY_NOT: '~';
BINARY_OR: '|';
BINARY_XOR: '^';
C_CUR: '}';
C_BRA: ']';
C_PAR: ')';
COMMA: ',';
DIV: '/';
DOT: '.';
DOUBLE: INTEGER DOT ('0'..'9')+;
DOUBLE_DOT: '..';
DOUBLE_EQ: '==';
DOUBLE_QUOTE_STRING: UNTERMINATED_DOUBLE_QUOTE_STRING '"';
EQ: '=';
FALSE: 'false';
GEQ: '>=';
GT: '>';
IN: ':';
INTEGER: ('0' | '1'..'9'('0'..'9')*);
LEQ: '=<';
LT: '<';
MINUS: '-';
MOD: '%';
NL: '\n';
NOT: '!';
NOT_EQ: '!=';
OR: '||';
O_CUR: '{';
O_BRA: '[';
O_PAR: '(';
PLUS: '+';
POWER: '**';
PRINT: 'print';
PRINTLN: 'printl' | 'println';
REVERSE: '<->';
SHARP: '#';
SHUFFLE: '<~>';
SIMPLE_QUOTE_STRING: UNTERMINATED_SIMPLE_QUOTE_STRING '\'';
TIMES: '*';
TRUE: 'true';
UNTERMINATED_DOUBLE_QUOTE_STRING: ('"' (~["\\\r\n] | '\\' (. | EOF))*);
UNTERMINATED_SIMPLE_QUOTE_STRING: ('\'' (~['\\\r\n] | '\\' (. | EOF))*);

IDENTIFIER: ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
COMMENT : DIV TIMES .*? TIMES DIV -> skip;
LINE_COMMENT : DIV DIV ~[\r\n]* -> skip;
WS: [ \t]+ -> channel(HIDDEN);

ERROR: .;

program:
    instrs?
    ;

instrs:
    instr+
    ;

instr:
    NL #NewLine |
    PRINT expr NL #Print |
    PRINTLN expr NL #PrintLn |
    expr EQ expr NL #Eq |
    expr PLUS EQ expr NL #PlusEq |
    expr MINUS EQ expr NL #MinusEq |
    expr TIMES EQ expr NL #TimesEq |
    expr DIV EQ expr NL #DivEq
    ;

expr:
    FALSE #False |
    TRUE #True |
    IDENTIFIER #Identifier |
    SIMPLE_QUOTE_STRING #String |
    DOUBLE_QUOTE_STRING #String |
    INTEGER #Integer |
    DOUBLE #Double |
    O_PAR expr C_PAR #Parenthesis |
    O_BRA C_BRA #EmptyList |
    O_CUR C_CUR #EmptySet |
    O_BRA (expr | range) (COMMA (expr | range))* C_BRA #List |
    O_CUR (expr | range) (COMMA (expr | range))* C_CUR #Set |
    SHARP expr #Length |
    <assoc=right> op=(REVERSE | SHUFFLE) expr #UCombined |
    expr op=(DOT | ARROW_LEFT | ARROW_RIGHT) expr #Combined |
    <assoc=right> op=(PLUS | MINUS | NOT | BINARY_NOT) expr #UPlusMinusNotBinaryNot |
    <assoc=right> expr POWER expr #Power |
    expr op=(TIMES | DIV | MOD) expr #TimesDivMod |
    expr op=(PLUS | MINUS) expr #PlusMinus |
    expr IN expr #In |
    expr op=(LEQ | LT | GEQ | GT) expr #LeqLtGeqGt |
    expr op=(DOUBLE_EQ | NOT_EQ) expr #EqeqNoteq |
    expr op=(BINARY_AND | BINARY_XOR | BINARY_OR) expr #BinaryAndXorOr |
    expr AND expr #And |
    expr OR expr #Or
    ;

range:
    expr DOUBLE_DOT expr
    ;