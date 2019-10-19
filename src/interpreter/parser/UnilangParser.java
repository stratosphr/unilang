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
			DOUBLE_QUOTE_STRING = 1, PLUS = 2, PRINT = 3, PRINTLN = 4, SIMPLE_QUOTE_STRING = 5,
			SLASH = 6, TIMES = 7, UNTERMINATED_DOUBLE_QUOTE_STRING = 8, UNTERMINATED_SIMPLE_QUOTE_STRING = 9,
			WS = 10, COMMENT = 11, LINE_COMMENT = 12, ERROR = 13;
	public static final int
			RULE_program = 0, RULE_instrs = 1, RULE_instr = 2, RULE_expr = 3;
	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17*\4\2\t\2\4\3\t" +
					"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\7\3\16\n\3\f\3\16\3\21\13\3\3\4\3\4\3\4" +
					"\3\4\5\4\27\n\4\3\5\3\5\3\5\5\5\34\n\5\3\5\3\5\3\5\6\5!\n\5\r\5\16\5\"" +
					"\7\5%\n\5\f\5\16\5(\13\5\3\5\2\3\b\6\2\4\6\b\2\2\2*\2\n\3\2\2\2\4\17\3" +
					"\2\2\2\6\26\3\2\2\2\b\33\3\2\2\2\n\13\5\4\3\2\13\3\3\2\2\2\f\16\5\6\4" +
					"\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\5\3\2\2\2\21" +
					"\17\3\2\2\2\22\23\7\5\2\2\23\27\5\b\5\2\24\25\7\6\2\2\25\27\5\b\5\2\26" +
					"\22\3\2\2\2\26\24\3\2\2\2\27\7\3\2\2\2\30\31\b\5\1\2\31\34\7\7\2\2\32" +
					"\34\7\3\2\2\33\30\3\2\2\2\33\32\3\2\2\2\34&\3\2\2\2\35 \f\3\2\2\36\37" +
					"\7\4\2\2\37!\5\b\5\2 \36\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3" +
					"\2\2\2$\35\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\t\3\2\2\2(&\3\2\2" +
					"\2\7\17\26\33\"&";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final String[] ruleNames = makeRuleNames();
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	static {
		RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
	}

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

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
	public String getGrammarFileName() {
		return "Unilang.g4"; }

	@Override
	public String[] getRuleNames() {
		return ruleNames; }

	@Override
	public String getSerializedATN() {
		return _serializedATN; }

	@Override
	public ATN getATN() {
		return _ATN; }

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(8);
				instrs();
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
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == PRINT || _la == PRINTLN) {
					{
						{
							setState(10);
							instr();
						}
					}
					setState(15);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case SIMPLE_QUOTE_STRING: {
					_localctx = new SimpleQuoteStringContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;

					setState(23);
					match(SIMPLE_QUOTE_STRING);
				}
				break;
				case DOUBLE_QUOTE_STRING: {
					_localctx = new DoubleQuoteStringContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(24);
					match(DOUBLE_QUOTE_STRING);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
				_ctx.stop = _input.LT(-1);
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new PlusContext(new ExprContext(_parentctx, _parentState));
								pushNewRecursionContext(_localctx, _startState, RULE_expr);
								setState(27);
								if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(30);
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
										case 1: {
											{
												setState(28);
												match(PLUS);
												setState(29);
												expr(0);
											}
										}
										break;
										default:
											throw new NoViableAltException(this);
									}
									setState(32);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
								} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
							}
						}
					}
					setState(38);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
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
			return RULE_program; }
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
			return RULE_instrs; }
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
			return RULE_instr; }

		public void copyFrom(InstrContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class PrintContext extends InstrContext {
		public PrintContext(InstrContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode PRINT() {
			return getToken(UnilangParser.PRINT, 0); }

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
			return getToken(UnilangParser.PRINTLN, 0); }

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
			return RULE_expr; }

		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class SimpleQuoteStringContext extends ExprContext {
		public SimpleQuoteStringContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode SIMPLE_QUOTE_STRING() {
			return getToken(UnilangParser.SIMPLE_QUOTE_STRING, 0); }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitSimpleQuoteString(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class DoubleQuoteStringContext extends ExprContext {
		public DoubleQuoteStringContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode DOUBLE_QUOTE_STRING() {
			return getToken(UnilangParser.DOUBLE_QUOTE_STRING, 0); }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitDoubleQuoteString(this);
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