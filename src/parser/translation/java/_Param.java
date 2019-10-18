package parser.translation.java;

/**
 * Created by gvoiron on 18/10/19.
 * Time : 17:29
 */
public class _Param extends _AObject {

    private final String type;
    private final String name;

    public _Param(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return type + " " + name;
    }

}
