package agsmicrosystems.lispscript.ast.prototype;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public interface ISmtcElem {

    /**
     * For those AST element that require InterpEnv, please hold the reference on your own.
     * @return
     */
    public IFundValue evaluate();
}
