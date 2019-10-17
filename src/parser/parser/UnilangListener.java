// Generated from /home/gvoiron/IdeaProjects/unilang/src/parser/Unilang.g4 by ANTLR 4.7.2
package parser.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UnilangParser}.
 */
public interface UnilangListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link UnilangParser#start}.
     *
     * @param ctx the parse tree
     */
    void enterStart(UnilangParser.StartContext ctx);

    /**
     * Exit a parse tree produced by {@link UnilangParser#start}.
     *
     * @param ctx the parse tree
     */
    void exitStart(UnilangParser.StartContext ctx);

    /**
     * Enter a parse tree produced by {@link UnilangParser#list_expr}.
     *
     * @param ctx the parse tree
     */
    void enterList_expr(UnilangParser.List_exprContext ctx);

    /**
     * Exit a parse tree produced by {@link UnilangParser#list_expr}.
     *
     * @param ctx the parse tree
     */
    void exitList_expr(UnilangParser.List_exprContext ctx);
}