// Generated from /home/gvoiron/IdeaProjects/unilang/src/parser/Unilang.g4 by ANTLR 4.7.2
package parser.parser;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link UnilangVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class UnilangBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements UnilangVisitor<T> {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitStart(UnilangParser.StartContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitList_expr(UnilangParser.List_exprContext ctx) {
        return visitChildren(ctx);
    }
}