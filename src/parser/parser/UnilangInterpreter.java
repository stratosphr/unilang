package parser.parser;

import parser.parser.errors.UnilangErrorListener;

/**
 * Created by gvoiron on 18/10/19.
 * Time : 10:43
 */
public final class UnilangInterpreter extends UnilangBaseVisitor<Object> {

    private final UnilangErrorListener errorListener;

    public UnilangInterpreter(UnilangErrorListener errorListener) {
        this.errorListener = errorListener;
    }

}
