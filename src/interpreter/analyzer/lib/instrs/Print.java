package interpreter.analyzer.lib.instrs;

import interpreter.IInterpreter;
import interpreter.analyzer.lib.exprs.AExpr;

/**
 * Created by gvoiron on 19/10/19.
 * Time : 08:53
 */
public final class Print extends APrint {

    public Print(AExpr expr) {
        super(expr);
    }

    @Override
    public Object accept(IInterpreter interpreter) {
        return interpreter.visit(this);
    }

    @Override
    public String toString() {
        return "print " + getExpr();
    }

}
