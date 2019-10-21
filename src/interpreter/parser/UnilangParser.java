// Generated from /home/gvoiron/IdeaProjects/unilang/src/interpreter/parser/grammar/Unilang.g4 by ANTLR 4.7.2
package interpreter.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UnilangParser extends Parser {
	public static final int
            AND = 1, ARROW_LEFT = 2, ARROW_RIGHT = 3, BINARY_AND = 4, BINARY_NOT = 5, BINARY_OR = 6,
            BINARY_XOR = 7, C_CUR = 8, C_BRA = 9, C_PAR = 10, COMMA = 11, DIV = 12, DOT = 13, DOUBLE = 14,
            DOUBLE_DOT = 15, DOUBLE_EQ = 16, DOUBLE_QUOTE_STRING = 17, EQ = 18, FALSE = 19,
            GEQ = 20, GT = 21, IN = 22, INTEGER = 23, LEQ = 24, LT = 25, MINUS = 26, MOD = 27, NL = 28,
            NOT = 29, NOT_EQ = 30, OR = 31, O_CUR = 32, O_BRA = 33, O_PAR = 34, PLUS = 35, POWER = 36,
            PRINT = 37, PRINTLN = 38, REVERSE = 39, SHARP = 40, SHUFFLE = 41, SIMPLE_QUOTE_STRING = 42,
            TIMES = 43, TRUE = 44, UNTERMINATED_DOUBLE_QUOTE_STRING = 45, UNTERMINATED_SIMPLE_QUOTE_STRING = 46,
            IDENTIFIER = 47, COMMENT = 48, LINE_COMMENT = 49, WS = 50, ERROR = 51;

	protected static final DFA[] _decisionToDFA;
	public static final int
            RULE_program = 0, RULE_instrs = 1, RULE_instr = 2, RULE_expr = 3, RULE_range = 4;
	public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00a8\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\5\2\16\n\2\3\3\6\3\21\n\3\r\3\16" +
                    "\3\22\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3" +
                    "\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5Q\n\5\r\5\16\5R\3\5\3\5\3\5" +
                    "\3\5\3\5\5\5Z\n\5\3\5\3\5\3\5\5\5_\n\5\7\5a\n\5\f\5\16\5d\13\5\3\5\3\5" +
                    "\3\5\3\5\3\5\5\5k\n\5\3\5\3\5\3\5\5\5p\n\5\7\5r\n\5\f\5\16\5u\13\5\3\5" +
                    "\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\177\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3" +
                    "\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
                    "\3\5\3\5\3\5\3\5\3\5\7\5\u009f\n\5\f\5\16\5\u00a2\13\5\3\6\3\6\3\6\3\6" +
                    "\3\6\2\3\b\7\2\4\6\b\n\2\n\4\2))++\6\2\7\7\34\34\37\37%%\4\2\4\5\17\17" +
                    "\5\2\16\16\35\35--\4\2\34\34%%\4\2\26\27\32\33\4\2\22\22  \4\2\6\6\b\t" +
                    "\2\u00cb\2\r\3\2\2\2\4\20\3\2\2\2\6:\3\2\2\2\b~\3\2\2\2\n\u00a3\3\2\2" +
                    "\2\f\16\5\4\3\2\r\f\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\21\5\6\4\2\20" +
                    "\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\5\3\2\2\2\24" +
                    ";\7\36\2\2\25\26\7\'\2\2\26\27\5\b\5\2\27\30\7\36\2\2\30;\3\2\2\2\31\32" +
                    "\7(\2\2\32\33\5\b\5\2\33\34\7\36\2\2\34;\3\2\2\2\35\36\5\b\5\2\36\37\7" +
                    "\24\2\2\37 \5\b\5\2 !\7\36\2\2!;\3\2\2\2\"#\5\b\5\2#$\7%\2\2$%\7\24\2" +
                    "\2%&\5\b\5\2&\'\7\36\2\2\';\3\2\2\2()\5\b\5\2)*\7\34\2\2*+\7\24\2\2+," +
                    "\5\b\5\2,-\7\36\2\2-;\3\2\2\2./\5\b\5\2/\60\7-\2\2\60\61\7\24\2\2\61\62" +
                    "\5\b\5\2\62\63\7\36\2\2\63;\3\2\2\2\64\65\5\b\5\2\65\66\7\16\2\2\66\67" +
                    "\7\24\2\2\678\5\b\5\289\7\36\2\29;\3\2\2\2:\24\3\2\2\2:\25\3\2\2\2:\31" +
                    "\3\2\2\2:\35\3\2\2\2:\"\3\2\2\2:(\3\2\2\2:.\3\2\2\2:\64\3\2\2\2;\7\3\2" +
                    "\2\2<=\b\5\1\2=\177\7\25\2\2>\177\7.\2\2?\177\7\61\2\2@\177\7,\2\2A\177" +
                    "\7\23\2\2B\177\7\31\2\2C\177\7\20\2\2DE\7$\2\2EF\5\b\5\2FG\7\f\2\2G\177" +
                    "\3\2\2\2HI\7#\2\2I\177\7\13\2\2JK\7\"\2\2K\177\7\n\2\2LM\7$\2\2MP\5\b" +
                    "\5\2NO\7\r\2\2OQ\5\b\5\2PN\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2" +
                    "\2\2TU\7\f\2\2U\177\3\2\2\2VY\7#\2\2WZ\5\b\5\2XZ\5\n\6\2YW\3\2\2\2YX\3" +
                    "\2\2\2Zb\3\2\2\2[^\7\r\2\2\\_\5\b\5\2]_\5\n\6\2^\\\3\2\2\2^]\3\2\2\2_" +
                    "a\3\2\2\2`[\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2" +
                    "ef\7\13\2\2f\177\3\2\2\2gj\7\"\2\2hk\5\b\5\2ik\5\n\6\2jh\3\2\2\2ji\3\2" +
                    "\2\2ks\3\2\2\2lo\7\r\2\2mp\5\b\5\2np\5\n\6\2om\3\2\2\2on\3\2\2\2pr\3\2" +
                    "\2\2ql\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\n" +
                    "\2\2w\177\3\2\2\2xy\t\2\2\2y\177\5\b\5\17z{\7*\2\2{\177\5\b\5\r|}\t\3" +
                    "\2\2}\177\5\b\5\f~<\3\2\2\2~>\3\2\2\2~?\3\2\2\2~@\3\2\2\2~A\3\2\2\2~B" +
                    "\3\2\2\2~C\3\2\2\2~D\3\2\2\2~H\3\2\2\2~J\3\2\2\2~L\3\2\2\2~V\3\2\2\2~" +
                    "g\3\2\2\2~x\3\2\2\2~z\3\2\2\2~|\3\2\2\2\177\u00a0\3\2\2\2\u0080\u0081" +
                    "\f\16\2\2\u0081\u0082\t\4\2\2\u0082\u009f\5\b\5\17\u0083\u0084\f\13\2" +
                    "\2\u0084\u0085\7&\2\2\u0085\u009f\5\b\5\13\u0086\u0087\f\n\2\2\u0087\u0088" +
                    "\t\5\2\2\u0088\u009f\5\b\5\13\u0089\u008a\f\t\2\2\u008a\u008b\t\6\2\2" +
                    "\u008b\u009f\5\b\5\n\u008c\u008d\f\b\2\2\u008d\u008e\7\30\2\2\u008e\u009f" +
                    "\5\b\5\t\u008f\u0090\f\7\2\2\u0090\u0091\t\7\2\2\u0091\u009f\5\b\5\b\u0092" +
                    "\u0093\f\6\2\2\u0093\u0094\t\b\2\2\u0094\u009f\5\b\5\7\u0095\u0096\f\5" +
                    "\2\2\u0096\u0097\t\t\2\2\u0097\u009f\5\b\5\6\u0098\u0099\f\4\2\2\u0099" +
                    "\u009a\7\3\2\2\u009a\u009f\5\b\5\5\u009b\u009c\f\3\2\2\u009c\u009d\7!" +
                    "\2\2\u009d\u009f\5\b\5\4\u009e\u0080\3\2\2\2\u009e\u0083\3\2\2\2\u009e" +
                    "\u0086\3\2\2\2\u009e\u0089\3\2\2\2\u009e\u008c\3\2\2\2\u009e\u008f\3\2" +
                    "\2\2\u009e\u0092\3\2\2\2\u009e\u0095\3\2\2\2\u009e\u0098\3\2\2\2\u009e" +
                    "\u009b\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2" +
                    "\2\2\u00a1\t\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\5\b\5\2\u00a4\u00a5" +
                    "\7\21\2\2\u00a5\u00a6\5\b\5\2\u00a6\13\3\2\2\2\17\r\22:RY^bjos~\u009e" +
                    "\u00a0";
	public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
	public static final String[] ruleNames = makeRuleNames();

    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }
	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	public UnilangParser(TokenStream input) {
		super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	private static String[] makeRuleNames() {
        return new String[]{
                "program", "instrs", "instr", "expr", "range"
		};
	}

	private static String[] makeLiteralNames() {
        return new String[]{
                null, "'&&'", "'<-'", "'->'", "'&'", "'~'", "'|'", "'^'", "'}'", "']'",
                "')'", "','", "'/'", "'.'", null, "'..'", "'=='", null, "'='", "'false'",
                "'>='", "'>'", "':'", null, "'=<'", "'<'", "'-'", "'%'", "'\n'", "'!'",
                "'!='", "'||'", "'{'", "'['", "'('", "'+'", "'**'", "'print'", null,
                "'<->'", "'#'", "'<~>'", null, "'*'", "'true'"
		};
	}

	private static String[] makeSymbolicNames() {
        return new String[]{
                null, "AND", "ARROW_LEFT", "ARROW_RIGHT", "BINARY_AND", "BINARY_NOT",
                "BINARY_OR", "BINARY_XOR", "C_CUR", "C_BRA", "C_PAR", "COMMA", "DIV",
                "DOT", "DOUBLE", "DOUBLE_DOT", "DOUBLE_EQ", "DOUBLE_QUOTE_STRING", "EQ",
                "FALSE", "GEQ", "GT", "IN", "INTEGER", "LEQ", "LT", "MINUS", "MOD", "NL",
                "NOT", "NOT_EQ", "OR", "O_CUR", "O_BRA", "O_PAR", "PLUS", "POWER", "PRINT",
                "PRINTLN", "REVERSE", "SHARP", "SHUFFLE", "SIMPLE_QUOTE_STRING", "TIMES",
                "TRUE", "UNTERMINATED_DOUBLE_QUOTE_STRING", "UNTERMINATED_SIMPLE_QUOTE_STRING",
                "IDENTIFIER", "COMMENT", "LINE_COMMENT", "WS", "ERROR"
		};
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
    public ATN getATN() {
        return _ATN;
    }

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(11);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BINARY_NOT) | (1L << DOUBLE) | (1L << DOUBLE_QUOTE_STRING) | (1L << FALSE) | (1L << INTEGER) | (1L << MINUS) | (1L << NL) | (1L << NOT) | (1L << O_CUR) | (1L << O_BRA) | (1L << O_PAR) | (1L << PLUS) | (1L << PRINT) | (1L << PRINTLN) | (1L << REVERSE) | (1L << SHARP) | (1L << SHUFFLE) | (1L << SIMPLE_QUOTE_STRING) | (1L << TRUE) | (1L << IDENTIFIER))) != 0)) {
                    {
                        setState(10);
                        instrs();
                    }
                }

			}
        } catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
        } finally {
			exitRule();
		}
		return _localctx;
	}

	public final InstrsContext instrs() throws RecognitionException {
		InstrsContext _localctx = new InstrsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(14);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(13);
                            instr();
                        }
                    }
                    setState(16);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BINARY_NOT) | (1L << DOUBLE) | (1L << DOUBLE_QUOTE_STRING) | (1L << FALSE) | (1L << INTEGER) | (1L << MINUS) | (1L << NL) | (1L << NOT) | (1L << O_CUR) | (1L << O_BRA) | (1L << O_PAR) | (1L << PLUS) | (1L << PRINT) | (1L << PRINTLN) | (1L << REVERSE) | (1L << SHARP) | (1L << SHUFFLE) | (1L << SIMPLE_QUOTE_STRING) | (1L << TRUE) | (1L << IDENTIFIER))) != 0));
			}
        } catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
        } finally {
			exitRule();
		}
		return _localctx;
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instr);
		try {
            setState(56);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    _localctx = new NewLineContext(_localctx);
                    enterOuterAlt(_localctx, 1);
				{
                    setState(18);
                    match(NL);
                }
                break;
                case 2:
                    _localctx = new PrintContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(19);
                    match(PRINT);
                    setState(20);
                    expr(0);
                    setState(21);
                    match(NL);
				}
				break;
                case 3:
                    _localctx = new PrintLnContext(_localctx);
                    enterOuterAlt(_localctx, 3);
				{
                    setState(23);
                    match(PRINTLN);
                    setState(24);
                    expr(0);
                    setState(25);
                    match(NL);
                }
                break;
                case 4:
                    _localctx = new EqContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(27);
                    expr(0);
                    setState(28);
                    match(EQ);
                    setState(29);
                    expr(0);
                    setState(30);
                    match(NL);
                }
                break;
                case 5:
                    _localctx = new PlusEqContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(32);
                    expr(0);
                    setState(33);
                    match(PLUS);
                    setState(34);
                    match(EQ);
                    setState(35);
                    expr(0);
                    setState(36);
                    match(NL);
                }
                break;
                case 6:
                    _localctx = new MinusEqContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(38);
                    expr(0);
                    setState(39);
                    match(MINUS);
                    setState(40);
                    match(EQ);
                    setState(41);
                    expr(0);
                    setState(42);
                    match(NL);
                }
                break;
                case 7:
                    _localctx = new TimesEqContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(44);
                    expr(0);
                    setState(45);
                    match(TIMES);
                    setState(46);
                    match(EQ);
                    setState(47);
                    expr(0);
                    setState(48);
                    match(NL);
                }
                break;
                case 8:
                    _localctx = new DivEqContext(_localctx);
                    enterOuterAlt(_localctx, 8);
                {
                    setState(50);
                    expr(0);
                    setState(51);
                    match(DIV);
                    setState(52);
                    match(EQ);
                    setState(53);
                    expr(0);
                    setState(54);
                    match(NL);
                }
                break;
            }
        } catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
        } finally {
			exitRule();
		}
		return _localctx;
	}

    public final ExprContext expr() throws RecognitionException {
        return expr(0);
    }

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
        int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(124);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                    case 1: {
                        _localctx = new FalseContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(59);
                        match(FALSE);
                    }
                    break;
                    case 2: {
                        _localctx = new TrueContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(60);
                        match(TRUE);
                    }
                    break;
                    case 3: {
                        _localctx = new IdentifierContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(61);
                        match(IDENTIFIER);
                    }
                    break;
                    case 4: {
                        _localctx = new StringContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(62);
                        match(SIMPLE_QUOTE_STRING);
				}
				break;
                    case 5: {
                        _localctx = new StringContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(63);
                        match(DOUBLE_QUOTE_STRING);
				}
				break;
                    case 6: {
                        _localctx = new IntegerContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(64);
                        match(INTEGER);
				}
				break;
                    case 7: {
                        _localctx = new DoubleContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(65);
                        match(DOUBLE);
                    }
                    break;
                    case 8: {
                        _localctx = new ParenthesisContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(66);
                        match(O_PAR);
                        setState(67);
                        expr(0);
                        setState(68);
                        match(C_PAR);
                    }
                    break;
                    case 9: {
                        _localctx = new EmptyListContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(70);
                        match(O_BRA);
                        setState(71);
                        match(C_BRA);
                    }
                    break;
                    case 10: {
                        _localctx = new EmptySetContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(72);
                        match(O_CUR);
                        setState(73);
                        match(C_CUR);
                    }
                    break;
                    case 11: {
                        _localctx = new TupleContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(74);
                        match(O_PAR);
                        setState(75);
                        expr(0);
                        setState(78);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(76);
                                    match(COMMA);
                                    setState(77);
                                    expr(0);
                                }
                            }
                            setState(80);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == COMMA);
                        setState(82);
                        match(C_PAR);
                    }
                    break;
                    case 12: {
                        _localctx = new ListContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(84);
                        match(O_BRA);
                        setState(87);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                            case 1: {
                                setState(85);
                                expr(0);
                            }
                            break;
                            case 2: {
                                setState(86);
                                range();
                            }
                            break;
                        }
                        setState(96);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(89);
                                    match(COMMA);
                                    setState(92);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                                        case 1: {
                                            setState(90);
                                            expr(0);
                                        }
                                        break;
                                        case 2: {
                                            setState(91);
                                            range();
                                        }
                                        break;
                                    }
                                }
                            }
                            setState(98);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(99);
                        match(C_BRA);
                    }
                    break;
                    case 13: {
                        _localctx = new SetContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(101);
                        match(O_CUR);
                        setState(104);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                            case 1: {
                                setState(102);
                                expr(0);
                            }
                            break;
                            case 2: {
                                setState(103);
                                range();
                            }
                            break;
                        }
                        setState(113);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(106);
                                    match(COMMA);
                                    setState(109);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                                        case 1: {
                                            setState(107);
                                            expr(0);
                                        }
                                        break;
                                        case 2: {
                                            setState(108);
                                            range();
                                        }
                                        break;
                                    }
                                }
                            }
                            setState(115);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(116);
                        match(C_CUR);
                    }
                    break;
                    case 14: {
                        _localctx = new UCombinedContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(118);
                        ((UCombinedContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == REVERSE || _la == SHUFFLE)) {
                            ((UCombinedContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(119);
                        expr(13);
                    }
                    break;
                    case 15: {
                        _localctx = new LengthContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(120);
                        match(SHARP);
                        setState(121);
                        expr(11);
                    }
                    break;
                    case 16: {
                        _localctx = new UPlusMinusNotBinaryNotContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(122);
                        ((UPlusMinusNotBinaryNotContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BINARY_NOT) | (1L << MINUS) | (1L << NOT) | (1L << PLUS))) != 0))) {
                            ((UPlusMinusNotBinaryNotContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(123);
                        expr(10);
                    }
                    break;
			}
                _ctx.stop = _input.LT(-1);
                setState(158);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(156);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                                case 1: {
                                    _localctx = new CombinedContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(126);
                                    if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(127);
                                    ((CombinedContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARROW_LEFT) | (1L << ARROW_RIGHT) | (1L << DOT))) != 0))) {
                                        ((CombinedContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(128);
                                    expr(13);
                                }
                                break;
                                case 2: {
                                    _localctx = new PowerContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(129);
                                    if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(130);
                                    match(POWER);
                                    setState(131);
                                    expr(9);
                                }
                                break;
                                case 3: {
                                    _localctx = new TimesDivModContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(132);
                                    if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(133);
                                    ((TimesDivModContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << TIMES))) != 0))) {
                                        ((TimesDivModContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(134);
                                    expr(9);
                                }
                                break;
                                case 4: {
                                    _localctx = new PlusMinusContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(135);
                                    if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(136);
                                    ((PlusMinusContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == MINUS || _la == PLUS)) {
                                        ((PlusMinusContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(137);
                                    expr(8);
                                }
                                break;
                                case 5: {
                                    _localctx = new InContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(138);
                                    if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(139);
                                    match(IN);
                                    setState(140);
                                    expr(7);
                                }
                                break;
                                case 6: {
                                    _localctx = new LeqLtGeqGtContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(141);
                                    if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(142);
                                    ((LeqLtGeqGtContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GEQ) | (1L << GT) | (1L << LEQ) | (1L << LT))) != 0))) {
                                        ((LeqLtGeqGtContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(143);
                                    expr(6);
                                }
                                break;
                                case 7: {
                                    _localctx = new EqeqNoteqContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(144);
                                    if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(145);
                                    ((EqeqNoteqContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == DOUBLE_EQ || _la == NOT_EQ)) {
                                        ((EqeqNoteqContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(146);
                                    expr(5);
                                }
                                break;
                                case 8: {
                                    _localctx = new BinaryAndXorOrContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(147);
                                    if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(148);
                                    ((BinaryAndXorOrContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BINARY_AND) | (1L << BINARY_OR) | (1L << BINARY_XOR))) != 0))) {
                                        ((BinaryAndXorOrContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(149);
                                    expr(4);
                                }
                                break;
                                case 9: {
                                    _localctx = new AndContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(150);
                                    if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(151);
                                    match(AND);
                                    setState(152);
                                    expr(3);
                                }
                                break;
                                case 10: {
                                    _localctx = new OrContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(153);
                                    if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(154);
                                    match(OR);
                                    setState(155);
                                    expr(2);
                                }
                                break;
                            }
                        }
                    }
                    setState(160);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                }
			}
        } catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
        } finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

    public final RangeContext range() throws RecognitionException {
        RangeContext _localctx = new RangeContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_range);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(161);
                expr(0);
                setState(162);
                match(DOUBLE_DOT);
                setState(163);
                expr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
            case 3:
                return expr_sempred((ExprContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
            case 0:
                return precpred(_ctx, 12);
            case 1:
                return precpred(_ctx, 9);
            case 2:
                return precpred(_ctx, 8);
            case 3:
                return precpred(_ctx, 7);
            case 4:
                return precpred(_ctx, 6);
            case 5:
                return precpred(_ctx, 5);
            case 6:
                return precpred(_ctx, 4);
            case 7:
                return precpred(_ctx, 3);
            case 8:
                return precpred(_ctx, 2);
            case 9:
                return precpred(_ctx, 1);
		}
		return true;
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public InstrsContext instrs() {
			return getRuleContext(InstrsContext.class,0);
		}

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class InstrsContext extends ParserRuleContext {
		public InstrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}

		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}

        @Override
        public int getRuleIndex() {
            return RULE_instrs;
        }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitInstrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class InstrContext extends ParserRuleContext {
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        public InstrContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_instr;
        }

		public void copyFrom(InstrContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class PrintContext extends InstrContext {
        public PrintContext(InstrContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode PRINT() {
            return getToken(UnilangParser.PRINT, 0);
        }

		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

        public TerminalNode NL() {
            return getToken(UnilangParser.NL, 0);
        }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

    public static class DivEqContext extends InstrContext {
        public DivEqContext(InstrContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode DIV() {
            return getToken(UnilangParser.DIV, 0);
        }

        public TerminalNode EQ() {
            return getToken(UnilangParser.EQ, 0);
        }

        public TerminalNode NL() {
            return getToken(UnilangParser.NL, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitDivEq(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NewLineContext extends InstrContext {
        public NewLineContext(InstrContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode NL() {
            return getToken(UnilangParser.NL, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitNewLine(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TimesEqContext extends InstrContext {
        public TimesEqContext(InstrContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode TIMES() {
            return getToken(UnilangParser.TIMES, 0);
        }

        public TerminalNode EQ() {
            return getToken(UnilangParser.EQ, 0);
        }

        public TerminalNode NL() {
            return getToken(UnilangParser.NL, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitTimesEq(this);
            else return visitor.visitChildren(this);
        }
    }

	public static class PrintLnContext extends InstrContext {
        public PrintLnContext(InstrContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode PRINTLN() {
            return getToken(UnilangParser.PRINTLN, 0);
        }

		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

        public TerminalNode NL() {
            return getToken(UnilangParser.NL, 0);
        }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitPrintLn(this);
			else return visitor.visitChildren(this);
		}
	}

    public static class PlusEqContext extends InstrContext {
        public PlusEqContext(InstrContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode PLUS() {
            return getToken(UnilangParser.PLUS, 0);
        }

        public TerminalNode EQ() {
            return getToken(UnilangParser.EQ, 0);
        }

        public TerminalNode NL() {
            return getToken(UnilangParser.NL, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitPlusEq(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EqContext extends InstrContext {
        public EqContext(InstrContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode EQ() {
            return getToken(UnilangParser.EQ, 0);
        }

        public TerminalNode NL() {
            return getToken(UnilangParser.NL, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitEq(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MinusEqContext extends InstrContext {
        public MinusEqContext(InstrContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode MINUS() {
            return getToken(UnilangParser.MINUS, 0);
        }

        public TerminalNode EQ() {
            return getToken(UnilangParser.EQ, 0);
        }

        public TerminalNode NL() {
            return getToken(UnilangParser.NL, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitMinusEq(this);
            else return visitor.visitChildren(this);
        }
    }

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        public ExprContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}

    public static class SetContext extends ExprContext {
        public SetContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode O_CUR() {
            return getToken(UnilangParser.O_CUR, 0);
        }

        public TerminalNode C_CUR() {
            return getToken(UnilangParser.C_CUR, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<RangeContext> range() {
            return getRuleContexts(RangeContext.class);
        }

        public RangeContext range(int i) {
            return getRuleContext(RangeContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(UnilangParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(UnilangParser.COMMA, i);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitSet(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class OrContext extends ExprContext {
        public OrContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode OR() {
            return getToken(UnilangParser.OR, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitOr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InContext extends ExprContext {
        public InContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode IN() {
            return getToken(UnilangParser.IN, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitIn(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EmptySetContext extends ExprContext {
        public EmptySetContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode O_CUR() {
            return getToken(UnilangParser.O_CUR, 0);
        }

        public TerminalNode C_CUR() {
            return getToken(UnilangParser.C_CUR, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitEmptySet(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TrueContext extends ExprContext {
        public TrueContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode TRUE() {
            return getToken(UnilangParser.TRUE, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitTrue(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FalseContext extends ExprContext {
        public FalseContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode FALSE() {
            return getToken(UnilangParser.FALSE, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class StringContext extends ExprContext {
        public StringContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode SIMPLE_QUOTE_STRING() {
            return getToken(UnilangParser.SIMPLE_QUOTE_STRING, 0);
        }

        public TerminalNode DOUBLE_QUOTE_STRING() {
            return getToken(UnilangParser.DOUBLE_QUOTE_STRING, 0);
        }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

    public static class PlusMinusContext extends ExprContext {
        public Token op;

        public PlusMinusContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode PLUS() {
            return getToken(UnilangParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(UnilangParser.MINUS, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitPlusMinus(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class UPlusMinusNotBinaryNotContext extends ExprContext {
        public Token op;

        public UPlusMinusNotBinaryNotContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode PLUS() {
            return getToken(UnilangParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(UnilangParser.MINUS, 0);
        }

        public TerminalNode NOT() {
            return getToken(UnilangParser.NOT, 0);
        }

        public TerminalNode BINARY_NOT() {
            return getToken(UnilangParser.BINARY_NOT, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitUPlusMinusNotBinaryNot(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParenthesisContext extends ExprContext {
        public ParenthesisContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode O_PAR() {
            return getToken(UnilangParser.O_PAR, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode C_PAR() {
            return getToken(UnilangParser.C_PAR, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitParenthesis(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierContext extends ExprContext {
        public IdentifierContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(UnilangParser.IDENTIFIER, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EqeqNoteqContext extends ExprContext {
        public Token op;

        public EqeqNoteqContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode DOUBLE_EQ() {
            return getToken(UnilangParser.DOUBLE_EQ, 0);
        }

        public TerminalNode NOT_EQ() {
            return getToken(UnilangParser.NOT_EQ, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitEqeqNoteq(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ListContext extends ExprContext {
        public ListContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode O_BRA() {
            return getToken(UnilangParser.O_BRA, 0);
        }

        public TerminalNode C_BRA() {
            return getToken(UnilangParser.C_BRA, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<RangeContext> range() {
            return getRuleContexts(RangeContext.class);
        }

        public RangeContext range(int i) {
            return getRuleContext(RangeContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(UnilangParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(UnilangParser.COMMA, i);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EmptyListContext extends ExprContext {
        public EmptyListContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode O_BRA() {
            return getToken(UnilangParser.O_BRA, 0);
        }

        public TerminalNode C_BRA() {
            return getToken(UnilangParser.C_BRA, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitEmptyList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class UCombinedContext extends ExprContext {
        public Token op;

        public UCombinedContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode REVERSE() {
            return getToken(UnilangParser.REVERSE, 0);
        }

        public TerminalNode SHUFFLE() {
            return getToken(UnilangParser.SHUFFLE, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitUCombined(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DoubleContext extends ExprContext {
        public DoubleContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode DOUBLE() {
            return getToken(UnilangParser.DOUBLE, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitDouble(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TimesDivModContext extends ExprContext {
        public Token op;

        public TimesDivModContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode TIMES() {
            return getToken(UnilangParser.TIMES, 0);
        }

        public TerminalNode DIV() {
            return getToken(UnilangParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(UnilangParser.MOD, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitTimesDivMod(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IntegerContext extends ExprContext {
        public IntegerContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode INTEGER() {
            return getToken(UnilangParser.INTEGER, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitInteger(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LengthContext extends ExprContext {
        public LengthContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode SHARP() {
            return getToken(UnilangParser.SHARP, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitLength(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LeqLtGeqGtContext extends ExprContext {
        public Token op;

        public LeqLtGeqGtContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode LEQ() {
            return getToken(UnilangParser.LEQ, 0);
        }

        public TerminalNode LT() {
            return getToken(UnilangParser.LT, 0);
        }

        public TerminalNode GEQ() {
            return getToken(UnilangParser.GEQ, 0);
        }

        public TerminalNode GT() {
            return getToken(UnilangParser.GT, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitLeqLtGeqGt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AndContext extends ExprContext {
        public AndContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode AND() {
            return getToken(UnilangParser.AND, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitAnd(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BinaryAndXorOrContext extends ExprContext {
        public Token op;

        public BinaryAndXorOrContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode BINARY_AND() {
            return getToken(UnilangParser.BINARY_AND, 0);
        }

        public TerminalNode BINARY_XOR() {
            return getToken(UnilangParser.BINARY_XOR, 0);
        }

        public TerminalNode BINARY_OR() {
            return getToken(UnilangParser.BINARY_OR, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitBinaryAndXorOr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CombinedContext extends ExprContext {
        public Token op;

        public CombinedContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode DOT() {
            return getToken(UnilangParser.DOT, 0);
        }

        public TerminalNode ARROW_LEFT() {
            return getToken(UnilangParser.ARROW_LEFT, 0);
        }

        public TerminalNode ARROW_RIGHT() {
            return getToken(UnilangParser.ARROW_RIGHT, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitCombined(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TupleContext extends ExprContext {
        public TupleContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode O_PAR() {
            return getToken(UnilangParser.O_PAR, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode C_PAR() {
            return getToken(UnilangParser.C_PAR, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(UnilangParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(UnilangParser.COMMA, i);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitTuple(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PowerContext extends ExprContext {
        public PowerContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode POWER() {
            return getToken(UnilangParser.POWER, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitPower(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RangeContext extends ParserRuleContext {
        public RangeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode DOUBLE_DOT() {
            return getToken(UnilangParser.DOUBLE_DOT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_range;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}
}