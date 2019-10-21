package interpreter.analyzer.lib.exprs;

/**
 * Created by gvoiron on 21/10/2019.
 * Time : 22:57
 */
public enum EOp {

    PLUS("+"),
    MINUS("-");

    private final java.lang.String repr;

    EOp(java.lang.String repr) {
        this.repr = repr;
    }

    @Override
    public java.lang.String toString() {
        return repr;
    }

}
