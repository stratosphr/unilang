package interpreter.analyzer.lib.exprs;

import interpreter.IInterpreter;

/**
 * Created by gvoiron on 19/10/19.
 * Time : 22:57
 */
public final class Integer extends ANumber<java.lang.Integer> {

    public Integer(int value) {
        super(value);
    }

    @Override
    public Object accept(IInterpreter interpreter) {
        return interpreter.visit(this);
    }

    @Override
    public final AExpr plus(AExpr expr) {
        if (expr instanceof String) {
            return new String(toString() + expr);
        } else if (expr instanceof Integer) {
            return new Integer(getValue() + ((Integer) expr).getValue());
        } else {
            throw new Error("Invalid use of operator '+' between " + getClass().getSimpleName() + " and " + expr.getClass().getSimpleName() + ".");
        }
    }

    @Override
    public final AExpr minus(AExpr expr) {
        if (expr instanceof Integer) {
            return new Integer(getValue() - ((Integer) expr).getValue());
        } else {
            throw new Error("Invalid use of operator '-' between " + getClass().getSimpleName() + " and " + expr.getClass().getSimpleName() + ".");
        }
    }

    @Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(getValue());
    }

}
