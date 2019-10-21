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

}
