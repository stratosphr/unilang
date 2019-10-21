package interpreter.analyzer.lib.exprs;

import interpreter.IInterpreter;

/**
 * Created by gvoiron on 21/10/2019.
 * Time : 22:26
 */
public final class True extends AExpr {

    @Override
    public Object accept(IInterpreter interpreter) {
        return interpreter.visit(this);
    }

    @Override
    public java.lang.String toString() {
        return "true";
    }

}
