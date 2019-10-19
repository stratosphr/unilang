// Generated from /home/gvoiron/IdeaProjects/unilang/src/interpreter/parser/grammar/Unilang.g4 by ANTLR 4.7.2
package interpreter.parser;

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
     * Visit a parse tree produced by {@link UnilangParser#instrs}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInstrs(UnilangParser.InstrsContext ctx);

    /**
     * Visit a parse tree produced by the {@code Print}
     * labeled alternative in {@link UnilangParser#instr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrint(UnilangParser.PrintContext ctx);

    /**
     * Visit a parse tree produced by the {@code PrintLn}
     * labeled alternative in {@link UnilangParser#instr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrintLn(UnilangParser.PrintLnContext ctx);

    /**
     * Visit a parse tree produced by the {@code String}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitString(UnilangParser.StringContext ctx);

    /**
     * Visit a parse tree produced by the {@code Plus}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPlus(UnilangParser.PlusContext ctx);
}