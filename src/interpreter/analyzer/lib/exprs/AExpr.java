package interpreter.analyzer.lib.exprs;

import interpreter.analyzer.lib.AObject;

/**
 * Created by gvoiron on 19/10/19.
 * Time : 08:54
 */
public abstract class AExpr extends AObject {

    public abstract AExpr plus(AExpr expr);

    public abstract AExpr minus(AExpr expr);

    @Override
    public abstract java.lang.String toString();

}
