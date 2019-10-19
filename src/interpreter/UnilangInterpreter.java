package interpreter;

import interpreter.analyzer.lib.Program;
import interpreter.analyzer.lib.exprs.Integer;
import interpreter.analyzer.lib.exprs.String;
import interpreter.analyzer.lib.instrs.Print;
import interpreter.analyzer.lib.instrs.PrintLn;

/**
 * Created by gvoiron on 19/10/19.
 * Time : 08:27
 */
public final class UnilangInterpreter implements IInterpreter {

    public void interpret(Program program) {
        program.accept(this);
    }

    @Override
    public Object visit(Program program) {
        program.getInstrs().forEach(aInstr -> aInstr.accept(this));
        return null;
    }

    @Override
    public Object visit(Print print) {
        System.out.print(print.getExpr().accept(this));
        return null;
    }

    @Override
    public Object visit(PrintLn printLn) {
        System.out.println(printLn.getExpr().accept(this));
        return null;
    }

    @Override
    public Object visit(String string) {
        return string.getString();
    }

    @Override
    public Object visit(Integer integer) {
        return integer.getValue();
    }

}
