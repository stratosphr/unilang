package parser.translation;

import org.antlr.v4.runtime.tree.ParseTree;
import parser.parser.UnilangParser;
import parser.translation.errors.UnilangErrorListener;
import parser.translation.java.*;

import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Created by gvoiron on 18/10/19.
 * Time : 10:43
 */
public final class UnilangToJavaTranslator extends ATranslator {

    private final UnilangErrorListener errorListener;
    private String code;

    public UnilangToJavaTranslator(UnilangErrorListener errorListener) {
        this.errorListener = errorListener;
        this.code = "";
    }

    @Override
    public String translate(ParseTree ast) {
        return new _Class(
                "Main",
                Collections.emptyList(),
                Collections.emptyList(),
                Collections.singletonList(
                        new _Method(
                                _EAccessor.PUBLIC,
                                _EModifier.STATIC,
                                "void",
                                "main",
                                Collections.singletonList(
                                        new _Param("String[]", "args")
                                ),
                                ast.accept(this)
                        )
                )
        ).toString();
    }

    @Override
    public String visitStart(UnilangParser.StartContext ctx) {
        return visit(ctx.instrs());
    }

    @Override
    public String visitInstrs(UnilangParser.InstrsContext ctx) {
        return ctx.instr().stream().map(this::visit).collect(Collectors.joining("\n"));
    }

    @Override
    public String visitPrint(UnilangParser.PrintContext ctx) {
        return "System.out.print(" + visit(ctx.expr()) + ");";
    }

    @Override
    public String visitPrintLn(UnilangParser.PrintLnContext ctx) {
        return "System.out.println(" + visit(ctx.expr()) + ");";
    }

    @Override
    public String visitPlus(UnilangParser.PlusContext ctx) {
        return ctx.expr().stream().map(this::visit).collect(Collectors.joining(" + "));
    }

    @Override
    public String visitString(UnilangParser.StringContext ctx) {
        return "\"" + ctx.getText().substring(1, ctx.getText().length() - 1) + "\"";
    }

}
