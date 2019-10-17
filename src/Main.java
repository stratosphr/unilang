import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.parser.UnilangLexer;
import parser.parser.UnilangParser;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            CharStream file = CharStreams.fromFileName("/home/gvoiron/IdeaProjects/unilang/samples/full.txt");
            UnilangLexer lex = new UnilangLexer(file);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            UnilangParser parser = new UnilangParser(tokens);
            ParseTree ast = parser.start();
            System.out.println(ast);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
