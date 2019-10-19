package interpreter.analyzer.lib.exprs;

import interpreter.IInterpreter;

/**
 * Created by gvoiron on 19/10/19.
 * Time : 08:57
 */
public final class String extends AExpr {

    private final java.lang.String string;

    public String(java.lang.String string) {
        this.string = string;
    }

    public java.lang.String getString() {
        return string;
    }

    @Override
    public Object accept(IInterpreter interpreter) {
        return interpreter.visit(this);
    }

    @Override
    public AExpr plus(AExpr expr) {
        return new String(toString() + expr);
    }

}
