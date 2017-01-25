package agsmicrosystems.lispscript.ast.prototype;

import agsmicrosystems.lispscript.interp.InterpEnv;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public interface IValue extends ISmtcElem {

    public String getJavaValueDesc();
    public Object getValue();

    @Override
    public default IValue evaluate(InterpEnv env) {
        return this;
    }
}
