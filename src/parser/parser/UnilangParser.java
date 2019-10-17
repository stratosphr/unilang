// Generated from /home/gvoiron/IdeaProjects/unilang/src/parser/Unilang.g4 by ANTLR 4.7.2
package parser.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UnilangParser extends Parser {
    public static final int
            IDENTIFIER = 1, EQ = 2, SQB_O = 3, SQB_C = 4, WS = 5;
    public static final int
            RULE_start = 0, RULE_list_expr = 1;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\16\4\2\t\2\4\3" +
                    "\t\3\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\2\13\2\6\3\2\2\2\4" +
                    "\n\3\2\2\2\6\7\7\3\2\2\7\b\7\4\2\2\b\t\5\4\3\2\t\3\3\2\2\2\n\13\7\5\2" +
                    "\2\13\f\7\6\2\2\f\5\3\2\2\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

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

    public UnilangParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "start", "list_expr"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, "'='", "'['", "']'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "IDENTIFIER", "EQ", "SQB_O", "SQB_C", "WS"
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
    public ATN getATN() {
        return _ATN;
    }

    public final StartContext start() throws RecognitionException {
        StartContext _localctx = new StartContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_start);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(4);
                match(IDENTIFIER);
                setState(5);
                match(EQ);
                setState(6);
                list_expr();
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

    public final List_exprContext list_expr() throws RecognitionException {
        List_exprContext _localctx = new List_exprContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_list_expr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(8);
                match(SQB_O);
                setState(9);
                match(SQB_C);
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

    public static class StartContext extends ParserRuleContext {
        public StartContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(UnilangParser.IDENTIFIER, 0);
        }

        public TerminalNode EQ() {
            return getToken(UnilangParser.EQ, 0);
        }

        public List_exprContext list_expr() {
            return getRuleContext(List_exprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_start;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof UnilangListener) ((UnilangListener) listener).enterStart(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof UnilangListener) ((UnilangListener) listener).exitStart(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitStart(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class List_exprContext extends ParserRuleContext {
        public List_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode SQB_O() {
            return getToken(UnilangParser.SQB_O, 0);
        }

        public TerminalNode SQB_C() {
            return getToken(UnilangParser.SQB_C, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_list_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof UnilangListener) ((UnilangListener) listener).enterList_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof UnilangListener) ((UnilangListener) listener).exitList_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof UnilangVisitor) return ((UnilangVisitor<? extends T>) visitor).visitList_expr(this);
            else return visitor.visitChildren(this);
        }
    }
}