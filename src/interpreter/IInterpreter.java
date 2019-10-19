package interpreter;

import interpreter.analyzer.lib.Program;
import interpreter.analyzer.lib.exprs.String;
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

}
