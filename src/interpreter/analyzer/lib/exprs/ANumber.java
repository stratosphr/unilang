package interpreter.analyzer.lib.exprs;

/**
 * Created by gvoiron on 19/10/19.
 * Time : 23:09
 */
public abstract class ANumber<T extends Number> extends AExpr {

    private final T value;

    public ANumber(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
