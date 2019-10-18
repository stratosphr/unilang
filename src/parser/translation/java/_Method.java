package parser.translation.java;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by gvoiron on 18/10/19.
 * Time : 17:14
 */
public class _Method extends _AObject {

    private final _EAccessor accessor;
    private final _EModifier modifier;
    private final String returnType;
    private final String name;
    private final List<_Param> params;
    private final String body;

    public _Method(_EAccessor accessor, _EModifier modifier, String returnType, String name, List<_Param> params, String body) {
        this.accessor = accessor;
        this.modifier = modifier;
        this.returnType = returnType;
        this.name = name;
        this.params = params;
        this.body = body;
    }

    public _EAccessor getAccessor() {
        return accessor;
    }

    public String getReturnType() {
        return returnType;
    }

    public String getName() {
        return name;
    }

    public List<_Param> getParams() {
        return params;
    }

    @Override
    public String toString() {
        return accessor.toString().toLowerCase() + ((modifier == _EModifier.NONE) ? "" : " " + modifier.toString().toLowerCase()) + " " + returnType + " " + name + "(" + params.stream().map(_Param::toString).collect(Collectors.joining(", ")) + ") {\n" + body + "\n}";
    }

}
