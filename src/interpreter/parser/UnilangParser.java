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
			DOUBLE_QUOTE_STRING = 1, INTEGER = 2, MINUS = 3, PLUS = 4, PRINT = 5, PRINTLN = 6,
			SIMPLE_QUOTE_STRING = 7, SLASH = 8, TIMES = 9, UNTERMINATED_DOUBLE_QUOTE_STRING = 10,
			UNTERMINATED_SIMPLE_QUOTE_STRING = 11, WS = 12, COMMENT = 13, LINE_COMMENT = 14,
			ERROR = 15;

	protected static final DFA[] _decisionToDFA;
	public static final int
			RULE_program = 0, RULE_instrs = 1, RULE_instr = 2, RULE_expr = 3;
	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21+\4\2\t\2\4\3\t" +
					"\3\4\4\t\4\4\5\t\5\3\2\5\2\f\n\2\3\3\6\3\17\n\3\r\3\16\3\20\3\4\3\4\3" +
					"\4\3\4\5\4\27\n\4\3\5\3\5\3\5\3\5\5\5\35\n\5\3\5\3\5\3\5\6\5\"\n\5\r\5" +
					"\16\5#\7\5&\n\5\f\5\16\5)\13\5\3\5\2\3\b\6\2\4\6\b\2\2\2-\2\13\3\2\2\2" +
					"\4\16\3\2\2\2\6\26\3\2\2\2\b\34\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2\13\f" +
					"\3\2\2\2\f\3\3\2\2\2\r\17\5\6\4\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2" +
					"\2\2\20\21\3\2\2\2\21\5\3\2\2\2\22\23\7\7\2\2\23\27\5\b\5\2\24\25\7\b" +
					"\2\2\25\27\5\b\5\2\26\22\3\2\2\2\26\24\3\2\2\2\27\7\3\2\2\2\30\31\b\5" +
					"\1\2\31\35\7\t\2\2\32\35\7\3\2\2\33\35\7\4\2\2\34\30\3\2\2\2\34\32\3\2" +
					"\2\2\34\33\3\2\2\2\35\'\3\2\2\2\36!\f\3\2\2\37 \7\6\2\2 \"\5\b\5\2!\37" +
					"\3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%\36\3\2\2\2&)\3\2\2" +
					"\2\'%\3\2\2\2\'(\3\2\2\2(\t\3\2\2\2)\'\3\2\2\2\b\13\20\26\34#\'";
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
				"program", "instrs", "instr", "expr"
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
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == PRINT || _la == PRINTLN) {
					{
						setState(8);
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
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(11);
							instr();
						}
					}
					setState(14);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == PRINT || _la == PRINTLN);
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
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case PRINT:
					_localctx = new PrintContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(16);
					match(PRINT);
					setState(17);
					expr(0);
				}
				break;
				case PRINTLN:
					_localctx = new PrintLnContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(18);
					match(PRINTLN);
					setState(19);
					expr(0);
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case SIMPLE_QUOTE_STRING: {
					_localctx = new StringContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;

					setState(23);
					match(SIMPLE_QUOTE_STRING);
				}
				break;
				case DOUBLE_QUOTE_STRING: {
					_localctx = new StringContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(24);
					match(DOUBLE_QUOTE_STRING);
				}
				break;
				case INTEGER: {
					_localctx = new IntegerContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(25);
					match(INTEGER);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
				_ctx.stop = _input.LT(-1);
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new PlusContext(new ExprContext(_parentctx, _parentState));
								pushNewRecursionContext(_localctx, _startState, RULE_expr);
								setState(28);
								if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(31);
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
										case 1: {
											{
												setState(29);
												match(PLUS);
												setState(30);
												expr(0);
											}
										}
										break;
										default:
											throw new NoViableAltException(this);
									}
									setState(33);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
								} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
							}
						}
					}
					setState(39);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
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

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitPrint(this);
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

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitPrintLn(this);
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

	public static class PlusContext extends ExprContext {
		public PlusContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public List<TerminalNode> PLUS() {
			return getTokens(UnilangParser.PLUS);
		}

		public TerminalNode PLUS(int i) {
			return getToken(UnilangParser.PLUS, i);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
}