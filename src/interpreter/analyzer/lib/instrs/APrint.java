package interpreter.analyzer.lib.instrs;

import interpreter.analyzer.lib.exprs.AExpr;

/**
 * Created by gvoiron on 19/10/19.
 * Time : 09:31
 */
public abstract class APrint extends AInstr {

    private final AExpr expr;

    public APrint(AExpr expr) {
        this.expr = expr;
    }

    public AExpr getExpr() {
        return expr;
    }

}
