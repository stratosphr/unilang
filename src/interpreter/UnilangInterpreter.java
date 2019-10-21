package interpreter;

import interpreter.analyzer.lib.Program;
import interpreter.analyzer.lib.exprs.Integer;
import interpreter.analyzer.lib.exprs.String;
import interpreter.analyzer.lib.exprs.*;
import interpreter.analyzer.lib.instrs.Print;
import interpreter.analyzer.lib.instrs.PrintLn;

import java.util.LinkedHashMap;

/**
 * Created by gvoiron on 19/10/19.
 * Time : 08:27
 */
public final class UnilangInterpreter implements IInterpreter {

    private final LinkedHashMap<java.lang.String, AExpr> symbolsTable;

    public UnilangInterpreter() {
        this.symbolsTable = new LinkedHashMap<>();
    }

    public void interpret(Program program) {
        program.accept(this);
    }

    @Override
    public Object visit(Program program) {
        program.getInstrs().forEach(aInstr -> {
            if (aInstr != null) {
                aInstr.accept(this);
            }
        });
        return null;
    }

    @Override
    public Object visit(Print print) {
        System.out.print(print.getExpr().accept(this));
        return null;
    }

    @Override
    public Object visit(PrintLn printLn) {
        System.out.println(printLn.getExpr().accept(this));
        return null;
    }

    @Override
    public Object visit(String string) {
        return string.getString();
    }

    @Override
    public Object visit(Integer integer) {
        return integer.getValue();
    }

    @Override
    public Object visit(False aFalse) {
        return false;
    }

    @Override
    public Object visit(True aTrue) {
        return true;
    }

    @Override
    public Object visit(Var var) {
        return symbolsTable.get(var.getName()).accept(this);
    }

    @Override
    public Object visit(List list) {
        return list.getElements();
    }

    @Override
    public Object visit(Set set) {
        return set.getElements();
    }

    @Override
    public Object visit(Plus plus) {
        if (plus.getLeft() instanceof String) {
            return new String(plus.getLeft().accept(this).toString() + plus.getRight().accept(this).toString()).accept(this);
        }
        return null;
    }

    @Override
    public Object visit(Minus minus) {
        if (minus.getLeft() instanceof Integer) {
            //noinspection RedundantCast
            return (java.lang.Integer) minus.getLeft().accept(this) - (java.lang.Integer) minus.getRight().accept(this);
        }
        return null;
    }

}
