package parser.translation.java;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by gvoiron on 18/10/19.
 * Time : 17:05
 */
public final class _Class extends _AObject {

    private final String name;
    private final List<_AObject> fields;
    private final List<_AObject> constructors;
    private final List<_Method> methods;

    public _Class(String name, List<_AObject> fields, List<_AObject> constructors, List<_Method> methods) {
        this.name = name;
        this.fields = fields;
        this.constructors = constructors;
        this.methods = methods;
    }

    @Override
    public String toString() {
        return "public class " + name + " {" +
                fields.stream().map(_AObject::toString).collect(Collectors.joining("\n")) +
                "\n" +
                constructors.stream().map(_AObject::toString).collect(Collectors.joining("\n")) +
                "\n" +
                methods.stream().map(_Method::toString).collect(Collectors.joining("\n")) +
                "\n" +
                "\n}";
    }

}
