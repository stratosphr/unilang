package interpreter.analyzer;

import interpreter.analyzer.lib.AUnilangObject;
import interpreter.analyzer.lib.Program;
import interpreter.parser.UnilangBaseVisitor;
import interpreter.parser.errorhandling.UnilangErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by gvoiron on 19/10/19.
 * Time : 08:19
 */
public final class UnilangAnalyzer extends UnilangBaseVisitor<AUnilangObject> {

    private final UnilangErrorListener errorListener;
    private final Program program;

    public UnilangAnalyzer(UnilangErrorListener errorListener) {
        this.errorListener = errorListener;
        this.program = new Program();
    }

    public Program analyze(ParseTree ast) {
        ast.accept(this);
        return this.program;
    }

}
