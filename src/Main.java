import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.parser.UnilangInterpreter;
import parser.parser.UnilangLexer;
import parser.parser.UnilangParser;
import parser.parser.errors.UnilangErrorListener;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            UnilangInterpreter unilangInterpreter = new UnilangInterpreter(new UnilangErrorListener());
            CharStream file = CharStreams.fromFileName("/home/gvoiron/IdeaProjects/unilang/samples/full.txt");
            UnilangLexer lexer = new UnilangLexer(file);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new UnilangErrorListener());
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            UnilangParser parser = new UnilangParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new UnilangErrorListener());
            ParseTree ast = parser.start();
            ast.accept(unilangInterpreter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
