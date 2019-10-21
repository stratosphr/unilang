package interpreter.analyzer.lib.exprs;

import interpreter.IInterpreter;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Created by gvoiron on 21/10/2019.
 * Time : 22:42
 */
public final class Set extends ACollection {

    public Set() {
        super();
    }

    public Set(Collection<AExpr> elements) {
        super(new LinkedHashSet<>(elements));
    }

    @Override
    public Object accept(IInterpreter interpreter) {
        return interpreter.visit(this);
    }

}
