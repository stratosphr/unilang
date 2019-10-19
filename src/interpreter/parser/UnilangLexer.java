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
            DOUBLE_QUOTE_STRING = 1, INTEGER = 2, MINUS = 3, PLUS = 4, PRINT = 5, PRINTLN = 6,
            SIMPLE_QUOTE_STRING = 7, SLASH = 8, TIMES = 9, UNTERMINATED_DOUBLE_QUOTE_STRING = 10,
            UNTERMINATED_SIMPLE_QUOTE_STRING = 11, WS = 12, COMMENT = 13, LINE_COMMENT = 14,
            ERROR = 15;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0086\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3" +
                    "\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\5\3-\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6" +
                    "\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7F" +
                    "\n\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13T\n\13\7" +
                    "\13V\n\13\f\13\16\13Y\13\13\3\f\3\f\3\f\3\f\3\f\5\f`\n\f\7\fb\n\f\f\f" +
                    "\16\fe\13\f\3\r\6\rh\n\r\r\r\16\ri\3\r\3\r\3\16\3\16\3\16\7\16q\n\16\f" +
                    "\16\16\16t\13\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17~\n\17\f" +
                    "\17\16\17\u0081\13\17\3\17\3\17\3\20\3\20\3r\2\21\3\3\5\4\7\5\t\6\13\7" +
                    "\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\6\6\2\f\f\17" +
                    "\17$$^^\6\2\f\f\17\17))^^\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0091\2\3" +
                    "\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2" +
                    "\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31" +
                    "\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5,\3\2\2\2" +
                    "\7.\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21J\3\2" +
                    "\2\2\23L\3\2\2\2\25N\3\2\2\2\27Z\3\2\2\2\31g\3\2\2\2\33m\3\2\2\2\35z\3" +
                    "\2\2\2\37\u0084\3\2\2\2!\"\5\25\13\2\"#\7$\2\2#\4\3\2\2\2$-\7\62\2\2%" +
                    ")\4\63;\2&(\4\62;\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*-\3\2\2" +
                    "\2+)\3\2\2\2,$\3\2\2\2,%\3\2\2\2-\6\3\2\2\2./\7/\2\2/\b\3\2\2\2\60\61" +
                    "\7-\2\2\61\n\3\2\2\2\62\63\7r\2\2\63\64\7t\2\2\64\65\7k\2\2\65\66\7p\2" +
                    "\2\66\67\7v\2\2\67\f\3\2\2\289\7r\2\29:\7t\2\2:;\7k\2\2;<\7p\2\2<=\7v" +
                    "\2\2=F\7n\2\2>?\7r\2\2?@\7t\2\2@A\7k\2\2AB\7p\2\2BC\7v\2\2CD\7n\2\2DF" +
                    "\7p\2\2E8\3\2\2\2E>\3\2\2\2F\16\3\2\2\2GH\5\27\f\2HI\7)\2\2I\20\3\2\2" +
                    "\2JK\7\61\2\2K\22\3\2\2\2LM\7,\2\2M\24\3\2\2\2NW\7$\2\2OV\n\2\2\2PS\7" +
                    "^\2\2QT\13\2\2\2RT\7\2\2\3SQ\3\2\2\2SR\3\2\2\2TV\3\2\2\2UO\3\2\2\2UP\3" +
                    "\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\26\3\2\2\2YW\3\2\2\2Zc\7)\2\2[b" +
                    "\n\3\2\2\\_\7^\2\2]`\13\2\2\2^`\7\2\2\3_]\3\2\2\2_^\3\2\2\2`b\3\2\2\2" +
                    "a[\3\2\2\2a\\\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\30\3\2\2\2ec\3\2" +
                    "\2\2fh\t\4\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\b\r" +
                    "\2\2l\32\3\2\2\2mn\5\21\t\2nr\5\23\n\2oq\13\2\2\2po\3\2\2\2qt\3\2\2\2" +
                    "rs\3\2\2\2rp\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\5\23\n\2vw\5\21\t\2wx\3\2\2" +
                    "\2xy\b\16\3\2y\34\3\2\2\2z{\5\21\t\2{\177\5\21\t\2|~\n\5\2\2}|\3\2\2\2" +
                    "~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081" +
                    "\177\3\2\2\2\u0082\u0083\b\17\3\2\u0083\36\3\2\2\2\u0084\u0085\13\2\2" +
                    "\2\u0085 \3\2\2\2\17\2),ESUW_acir\177\4\2\3\2\b\2\2";
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
                "DOUBLE_QUOTE_STRING", "INTEGER", "MINUS", "PLUS", "PRINT", "PRINTLN",
                "SIMPLE_QUOTE_STRING", "SLASH", "TIMES", "UNTERMINATED_DOUBLE_QUOTE_STRING",
                "UNTERMINATED_SIMPLE_QUOTE_STRING", "WS", "COMMENT", "LINE_COMMENT",
                "ERROR"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, "'-'", "'+'", "'print'", null, null, "'/'", "'*'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "DOUBLE_QUOTE_STRING", "INTEGER", "MINUS", "PLUS", "PRINT", "PRINTLN",
                "SIMPLE_QUOTE_STRING", "SLASH", "TIMES", "UNTERMINATED_DOUBLE_QUOTE_STRING",
                "UNTERMINATED_SIMPLE_QUOTE_STRING", "WS", "COMMENT", "LINE_COMMENT",
                "ERROR"
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