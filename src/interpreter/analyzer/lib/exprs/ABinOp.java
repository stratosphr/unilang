package interpreter.analyzer.lib.exprs;

/**
 * Created by gvoiron on 21/10/2019.
 * Time : 22:56
 */
public abstract class ABinOp extends AExpr {

    private final EOp op;
    private AExpr left;
    private AExpr right;

    public ABinOp(EOp op, AExpr left, AExpr right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }

    public EOp getOp() {
        return op;
    }

    public AExpr getLeft() {
        return left;
    }

    public AExpr getRight() {
        return right;
    }

    @Override
    public final java.lang.String toString() {
        return getLeft().toString() + " " + getOp() + " " + getRight();
    }

}
