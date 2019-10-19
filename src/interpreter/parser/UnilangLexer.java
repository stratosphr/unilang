// Generated from /home/gvoiron/IdeaProjects/unilang/src/interpreter/parser/grammar/Unilang.g4 by ANTLR 4.7.2
package interpreter.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UnilangLexer extends Lexer {
    public static final int
            DOUBLE_QUOTE_STRING = 1, PLUS = 2, PRINT = 3, PRINTLN = 4, SIMPLE_QUOTE_STRING = 5,
            SLASH = 6, TIMES = 7, UNTERMINATED_DOUBLE_QUOTE_STRING = 8, UNTERMINATED_SIMPLE_QUOTE_STRING = 9,
            WS = 10, COMMENT = 11, LINE_COMMENT = 12, ERROR = 13;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17v\b\1\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\66\n\5\3" +
                    "\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tD\n\t\7\tF\n\t\f\t\16" +
                    "\tI\13\t\3\n\3\n\3\n\3\n\3\n\5\nP\n\n\7\nR\n\n\f\n\16\nU\13\n\3\13\6\13" +
                    "X\n\13\r\13\16\13Y\3\13\3\13\3\f\3\f\3\f\7\fa\n\f\f\f\16\fd\13\f\3\f\3" +
                    "\f\3\f\3\f\3\f\3\r\3\r\3\r\7\rn\n\r\f\r\16\rq\13\r\3\r\3\r\3\16\3\16\3" +
                    "b\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17" +
                    "\3\2\6\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\5\2\13\f\17\17\"\"\4\2\f\f" +
                    "\17\17\2\177\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2" +
                    "\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2" +
                    "\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5 \3\2\2\2\7\"\3\2" +
                    "\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r:\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23" +
                    "J\3\2\2\2\25W\3\2\2\2\27]\3\2\2\2\31j\3\2\2\2\33t\3\2\2\2\35\36\5\21\t" +
                    "\2\36\37\7$\2\2\37\4\3\2\2\2 !\7-\2\2!\6\3\2\2\2\"#\7r\2\2#$\7t\2\2$%" +
                    "\7k\2\2%&\7p\2\2&\'\7v\2\2\'\b\3\2\2\2()\7r\2\2)*\7t\2\2*+\7k\2\2+,\7" +
                    "p\2\2,-\7v\2\2-\66\7n\2\2./\7r\2\2/\60\7t\2\2\60\61\7k\2\2\61\62\7p\2" +
                    "\2\62\63\7v\2\2\63\64\7n\2\2\64\66\7p\2\2\65(\3\2\2\2\65.\3\2\2\2\66\n" +
                    "\3\2\2\2\678\5\23\n\289\7)\2\29\f\3\2\2\2:;\7\61\2\2;\16\3\2\2\2<=\7," +
                    "\2\2=\20\3\2\2\2>G\7$\2\2?F\n\2\2\2@C\7^\2\2AD\13\2\2\2BD\7\2\2\3CA\3" +
                    "\2\2\2CB\3\2\2\2DF\3\2\2\2E?\3\2\2\2E@\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3" +
                    "\2\2\2H\22\3\2\2\2IG\3\2\2\2JS\7)\2\2KR\n\3\2\2LO\7^\2\2MP\13\2\2\2NP" +
                    "\7\2\2\3OM\3\2\2\2ON\3\2\2\2PR\3\2\2\2QK\3\2\2\2QL\3\2\2\2RU\3\2\2\2S" +
                    "Q\3\2\2\2ST\3\2\2\2T\24\3\2\2\2US\3\2\2\2VX\t\4\2\2WV\3\2\2\2XY\3\2\2" +
                    "\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\b\13\2\2\\\26\3\2\2\2]^\5\r\7\2^b" +
                    "\5\17\b\2_a\13\2\2\2`_\3\2\2\2ad\3\2\2\2bc\3\2\2\2b`\3\2\2\2ce\3\2\2\2" +
                    "db\3\2\2\2ef\5\17\b\2fg\5\r\7\2gh\3\2\2\2hi\b\f\3\2i\30\3\2\2\2jk\5\r" +
                    "\7\2ko\5\r\7\2ln\n\5\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2" +
                    "\2\2qo\3\2\2\2rs\b\r\3\2s\32\3\2\2\2tu\13\2\2\2u\34\3\2\2\2\r\2\65CEG" +
                    "OQSYbo\4\2\3\2\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public UnilangLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "DOUBLE_QUOTE_STRING", "PLUS", "PRINT", "PRINTLN", "SIMPLE_QUOTE_STRING",
                "SLASH", "TIMES", "UNTERMINATED_DOUBLE_QUOTE_STRING", "UNTERMINATED_SIMPLE_QUOTE_STRING",
                "WS", "COMMENT", "LINE_COMMENT", "ERROR"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, "'+'", "'print'", null, null, "'/'", "'*'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "DOUBLE_QUOTE_STRING", "PLUS", "PRINT", "PRINTLN", "SIMPLE_QUOTE_STRING",
                "SLASH", "TIMES", "UNTERMINATED_DOUBLE_QUOTE_STRING", "UNTERMINATED_SIMPLE_QUOTE_STRING",
                "WS", "COMMENT", "LINE_COMMENT", "ERROR"
        };
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "Unilang.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}