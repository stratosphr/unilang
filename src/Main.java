import interpreter.UnilangInterpreter;
import interpreter.analyzer.UnilangAnalyzer;
import interpreter.analyzer.lib.Program;
import interpreter.parser.UnilangLexer;
import interpreter.parser.UnilangParser;
import interpreter.parser.errorhandling.UnilangErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            UnilangAnalyzer unilangAnalyzer = new UnilangAnalyzer(new UnilangErrorListener());
            UnilangInterpreter unilangInterpreter = new UnilangInterpreter();
            UnilangErrorListener unilangErrorListener = new UnilangErrorListener();
            CharStream file = CharStreams.fromFileName("/home/gvoiron/IdeaProjects/unilang/samples/test.txt");
            UnilangLexer lexer = new UnilangLexer(file);
            lexer.removeErrorListeners();
            lexer.addErrorListener(unilangErrorListener);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            UnilangParser parser = new UnilangParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(unilangErrorListener);
            Program program = unilangAnalyzer.analyze(parser);
            unilangInterpreter.interpret(program);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
