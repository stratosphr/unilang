package interpreter.analyzer.lib.exprs;

import interpreter.IInterpreter;

/**
 * Created by gvoiron on 21/10/2019.
 * Time : 22:32
 */
public class Var extends AExpr {

    private final java.lang.String name;

    public Var(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return name;
    }

    @Override
    public Object accept(IInterpreter interpreter) {
        return interpreter.visit(this);
    }

    @Override
    public java.lang.String toString() {
        return name;
    }

}
