package interpreter;

import interpreter.analyzer.lib.Program;
import interpreter.analyzer.lib.exprs.Integer;
import interpreter.analyzer.lib.exprs.String;
import interpreter.analyzer.lib.exprs.*;
import interpreter.analyzer.lib.instrs.Print;
import interpreter.analyzer.lib.instrs.PrintLn;

/**
 * Created by gvoiron on 19/10/19.
 * Time : 09:12
 */
public interface IInterpreter {

    Object visit(Program program);

    Object visit(Print print);

    Object visit(PrintLn printLn);

    Object visit(String string);

    Object visit(Integer integer);

    Object visit(False aFalse);

    Object visit(True aTrue);

    Object visit(Var var);

    Object visit(List list);

    Object visit(Set set);

    Object visit(Plus plus);

    Object visit(Minus minus);

}
