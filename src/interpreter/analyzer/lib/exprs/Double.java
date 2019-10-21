package interpreter.analyzer.lib.exprs;

import interpreter.IInterpreter;

/**
 * Created by gvoiron on 21/10/2019.
 * Time : 22:13
 */
public class Double extends ANumber<java.lang.Double> {

    public Double(double value) {
        super(value);
    }

    @Override
    public Object accept(IInterpreter interpreter) {
        return null;
    }

}
