package interpreter;

/**
 * Created by gvoiron on 19/10/19.
 * Time : 09:11
 */
public interface IInterpretable {

    Object accept(IInterpreter interpreter);

}
