package interpreter.analyzer;

import interpreter.analyzer.lib.AObject;
import interpreter.analyzer.lib.Program;
import interpreter.analyzer.lib.exprs.Double;
import interpreter.analyzer.lib.exprs.Integer;
import interpreter.analyzer.lib.exprs.String;
import interpreter.analyzer.lib.exprs.*;
import interpreter.analyzer.lib.instrs.AInstr;
import interpreter.analyzer.lib.instrs.Print;
import interpreter.analyzer.lib.instrs.PrintLn;
import interpreter.parser.UnilangBaseVisitor;
import interpreter.parser.UnilangParser;
import interpreter.parser.errorhandling.UnilangErrorListener;

/**
 * Created by gvoiron on 19/10/19.
 * Time : 08:19
 */
public final class UnilangAnalyzer extends UnilangBaseVisitor<AObject> {

    private final UnilangErrorListener errorListener;
    private final Program program;

    public UnilangAnalyzer(UnilangErrorListener errorListener) {
        this.errorListener = errorListener;
        this.program = new Program();
    }

    public Program analyze(UnilangParser parser) {
        return (Program) parser.program().accept(this);
    }

    @Override
    public Program visitProgram(UnilangParser.ProgramContext ctx) {
        ctx.instrs().accept(this);
        return program;
    }

    @Override
    public AObject visitInstrs(UnilangParser.InstrsContext ctx) {
        ctx.instr().forEach(instrContext -> program.addInstr((AInstr) instrContext.accept(this)));
        return null;
    }

    @Override
    public AObject visitPrint(UnilangParser.PrintContext ctx) {
        return new Print((AExpr) ctx.expr().accept(this));
    }

    @Override
    public AObject visitPrintLn(UnilangParser.PrintLnContext ctx) {
        return new PrintLn((AExpr) ctx.expr().accept(this));
    }

    @Override
    public AObject visitFalse(UnilangParser.FalseContext ctx) {
        return new False();
    }

    @Override
    public AObject visitTrue(UnilangParser.TrueContext ctx) {
        return new True();
    }

    @Override
    public AObject visitInteger(UnilangParser.IntegerContext ctx) {
        return new Integer(java.lang.Integer.parseInt(ctx.getText()));
    }

    @Override
    public AObject visitDouble(UnilangParser.DoubleContext ctx) {
        return new Double(java.lang.Double.parseDouble(ctx.getText()));
    }

    @Override
    public AObject visitString(UnilangParser.StringContext ctx) {
        return new String(ctx.getText().substring(1, ctx.getText().length() - 1));
    }

    @Override
    public AObject visitIdentifier(UnilangParser.IdentifierContext ctx) {
        return new Var(ctx.getText());
    }

    @Override
    public AObject visitParenthesis(UnilangParser.ParenthesisContext ctx) {
        return ctx.expr().accept(this);
    }

    @Override
    public AObject visitEmptyList(UnilangParser.EmptyListContext ctx) {
        return new List();
    }

    @Override
    public AObject visitEmptySet(UnilangParser.EmptySetContext ctx) {
        return new Set();
    }

    @Override
    public AObject visitPlusMinus(UnilangParser.PlusMinusContext ctx) {
        AExpr left = (AExpr) ctx.expr(0).accept(this);
        AExpr right = (AExpr) ctx.expr(1).accept(this);
        return ctx.op.getType() == UnilangParser.PLUS ? new Plus(left, right) : new Minus(left, right);
    }

}
