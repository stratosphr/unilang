package interpreter.analyzer;

import interpreter.analyzer.lib.AObject;
import interpreter.analyzer.lib.Program;
import interpreter.analyzer.lib.exprs.AExpr;
import interpreter.analyzer.lib.exprs.Integer;
import interpreter.analyzer.lib.exprs.String;
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
    public AObject visitString(UnilangParser.StringContext ctx) {
        return new String(ctx.getText().substring(1, ctx.getText().length() - 1));
    }

    @Override
    public AObject visitPlus(UnilangParser.PlusContext ctx) {
        return ctx.expr().stream().map(exprContext -> (AExpr) exprContext.accept(this)).reduce(AExpr::plus).orElseThrow();
    }

    @Override
    public AObject visitInteger(UnilangParser.IntegerContext ctx) {
        return new Integer(java.lang.Integer.parseInt(ctx.getText()));
    }

}
