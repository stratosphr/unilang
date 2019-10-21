package interpreter.analyzer.lib.exprs;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by gvoiron on 21/10/2019.
 * Time : 22:42
 */
public abstract class ACollection extends AExpr {

    private final Collection<AExpr> elements;

    public ACollection() {
        this(Collections.emptyList());
    }

    public ACollection(Collection<AExpr> elements) {
        this.elements = elements;
    }

    public final Collection<AExpr> getElements() {
        return elements;
    }

    @Override
    public final java.lang.String toString() {
        return getElements().toString();
    }

}
