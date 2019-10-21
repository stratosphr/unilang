package interpreter.analyzer.lib.exprs;

import interpreter.IInterpreter;

/**
 * Created by gvoiron on 21/10/2019.
 * Time : 22:54
 */
public final class Minus extends ABinOp {

    public Minus(AExpr left, AExpr right) {
        super(EOp.MINUS, left, right);
    }

    @Override
    public Object accept(IInterpreter interpreter) {
        return interpreter.visit(this);
    }

}
