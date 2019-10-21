package interpreter.analyzer.lib.instrs;

import interpreter.IInterpreter;
import interpreter.analyzer.lib.exprs.AExpr;

/**
 * Created by gvoiron on 19/10/19.
 * Time : 09:30
 */
public final class PrintLn extends APrint {

    public PrintLn(AExpr expr) {
        super(expr);
    }

    @Override
    public Object accept(IInterpreter interpreter) {
        return interpreter.visit(this);
    }

    @Override
    public String toString() {
        return "println " + getExpr();
    }

}
