package interpreter.analyzer.lib.exprs;

import interpreter.IInterpreter;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by gvoiron on 21/10/2019.
 * Time : 22:38
 */
public final class List extends ACollection {

    public List() {
        super();
    }

    public List(Collection<AExpr> elements) {
        super(new ArrayList<>(elements));
    }

    @Override
    public Object accept(IInterpreter interpreter) {
        return interpreter.visit(this);
    }

}
