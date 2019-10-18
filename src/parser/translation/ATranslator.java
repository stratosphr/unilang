package parser.translation;

import org.antlr.v4.runtime.tree.ParseTree;
import parser.parser.UnilangBaseVisitor;

/**
 * Created by gvoiron on 18/10/19.
 * Time : 17:03
 */
abstract class ATranslator extends UnilangBaseVisitor<String> {

    public abstract String translate(ParseTree ast);

}
