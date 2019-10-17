// Generated from /home/gvoiron/IdeaProjects/unilang/src/parser/Unilang.g4 by ANTLR 4.7.2
package parser.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UnilangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface UnilangVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link UnilangParser#start}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStart(UnilangParser.StartContext ctx);

    /**
     * Visit a parse tree produced by {@link UnilangParser#list_expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitList_expr(UnilangParser.List_exprContext ctx);
}