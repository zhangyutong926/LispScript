package agsmicrosystems.lispscript.ast.prototype;

import agsmicrosystems.lispscript.interp.InterpEnv;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public interface IValueLiteral extends ISmtcElem {

    public String getJavaValueDesc();
    public Object getValue();

    /*
     * Without the prefix #
     */
    public String getConstructorKeyword();

    @Override
    public default IValueLiteral evaluate(InterpEnv env) {
        return this;
    }
}
