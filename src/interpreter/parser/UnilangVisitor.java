// Generated from /home/gvoiron/IdeaProjects/unilang/src/interpreter/parser/grammar/Unilang.g4 by ANTLR 4.7.2
package interpreter.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UnilangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UnilangVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link UnilangParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(UnilangParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link UnilangParser#instrs}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInstrs(UnilangParser.InstrsContext ctx);

    /**
     * Visit a parse tree produced by the {@code NewLine}
     * labeled alternative in {@link UnilangParser#instr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNewLine(UnilangParser.NewLineContext ctx);

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
     * Visit a parse tree produced by the {@code Eq}
     * labeled alternative in {@link UnilangParser#instr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEq(UnilangParser.EqContext ctx);

    /**
     * Visit a parse tree produced by the {@code PlusEq}
     * labeled alternative in {@link UnilangParser#instr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPlusEq(UnilangParser.PlusEqContext ctx);

    /**
     * Visit a parse tree produced by the {@code MinusEq}
     * labeled alternative in {@link UnilangParser#instr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMinusEq(UnilangParser.MinusEqContext ctx);

    /**
     * Visit a parse tree produced by the {@code TimesEq}
     * labeled alternative in {@link UnilangParser#instr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTimesEq(UnilangParser.TimesEqContext ctx);

    /**
     * Visit a parse tree produced by the {@code DivEq}
     * labeled alternative in {@link UnilangParser#instr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDivEq(UnilangParser.DivEqContext ctx);

    /**
     * Visit a parse tree produced by the {@code Set}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSet(UnilangParser.SetContext ctx);

    /**
     * Visit a parse tree produced by the {@code Or}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOr(UnilangParser.OrContext ctx);

    /**
     * Visit a parse tree produced by the {@code In}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIn(UnilangParser.InContext ctx);

    /**
     * Visit a parse tree produced by the {@code EmptySet}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEmptySet(UnilangParser.EmptySetContext ctx);

    /**
     * Visit a parse tree produced by the {@code True}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTrue(UnilangParser.TrueContext ctx);

    /**
     * Visit a parse tree produced by the {@code False}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFalse(UnilangParser.FalseContext ctx);

    /**
     * Visit a parse tree produced by the {@code String}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitString(UnilangParser.StringContext ctx);

    /**
     * Visit a parse tree produced by the {@code PlusMinus}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPlusMinus(UnilangParser.PlusMinusContext ctx);

    /**
     * Visit a parse tree produced by the {@code UPlusMinusNotBinaryNot}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUPlusMinusNotBinaryNot(UnilangParser.UPlusMinusNotBinaryNotContext ctx);

    /**
     * Visit a parse tree produced by the {@code Parenthesis}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParenthesis(UnilangParser.ParenthesisContext ctx);

    /**
     * Visit a parse tree produced by the {@code Identifier}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifier(UnilangParser.IdentifierContext ctx);

    /**
     * Visit a parse tree produced by the {@code EqeqNoteq}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEqeqNoteq(UnilangParser.EqeqNoteqContext ctx);

    /**
     * Visit a parse tree produced by the {@code List}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitList(UnilangParser.ListContext ctx);

    /**
     * Visit a parse tree produced by the {@code EmptyList}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEmptyList(UnilangParser.EmptyListContext ctx);

    /**
     * Visit a parse tree produced by the {@code UCombined}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUCombined(UnilangParser.UCombinedContext ctx);

    /**
     * Visit a parse tree produced by the {@code Double}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDouble(UnilangParser.DoubleContext ctx);

    /**
     * Visit a parse tree produced by the {@code TimesDivMod}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTimesDivMod(UnilangParser.TimesDivModContext ctx);

    /**
     * Visit a parse tree produced by the {@code Integer}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInteger(UnilangParser.IntegerContext ctx);

    /**
     * Visit a parse tree produced by the {@code Length}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLength(UnilangParser.LengthContext ctx);

    /**
     * Visit a parse tree produced by the {@code LeqLtGeqGt}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLeqLtGeqGt(UnilangParser.LeqLtGeqGtContext ctx);

    /**
     * Visit a parse tree produced by the {@code And}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAnd(UnilangParser.AndContext ctx);

    /**
     * Visit a parse tree produced by the {@code BinaryAndXorOr}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBinaryAndXorOr(UnilangParser.BinaryAndXorOrContext ctx);

    /**
     * Visit a parse tree produced by the {@code Combined}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCombined(UnilangParser.CombinedContext ctx);

    /**
     * Visit a parse tree produced by the {@code Tuple}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTuple(UnilangParser.TupleContext ctx);

    /**
     * Visit a parse tree produced by the {@code Power}
     * labeled alternative in {@link UnilangParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPower(UnilangParser.PowerContext ctx);

    /**
     * Visit a parse tree produced by {@link UnilangParser#range}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRange(UnilangParser.RangeContext ctx);
}