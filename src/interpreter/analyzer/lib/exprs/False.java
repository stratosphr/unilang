package interpreter.analyzer.lib.exprs;

import interpreter.IInterpreter;

/**
 * Created by gvoiron on 21/10/2019.
 * Time : 22:24
 */
public final class False extends AExpr {

    @Override
    public Object accept(IInterpreter interpreter) {
        return interpreter.visit(this);
    }

    @Override
    public java.lang.String toString() {
        return "false";
    }

}
