package interpreter.analyzer.lib;

import interpreter.IInterpreter;
import interpreter.analyzer.lib.instrs.AInstr;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by gvoiron on 19/10/19.
 * Time : 08:24
 */
public final class Program extends AObject {

    private final ArrayList<AInstr> instrs;

    public Program() {
        this.instrs = new ArrayList<>();
    }

    public void addInstr(AInstr instr) {
        instrs.add(instr);
    }

    public ArrayList<AInstr> getInstrs() {
        return instrs;
    }

    @Override
    public Object accept(IInterpreter interpreter) {
        return interpreter.visit(this);
    }

    @Override
    public String toString() {
        return instrs.stream().map(AObject::toString).collect(Collectors.joining("\n"));
    }

}
