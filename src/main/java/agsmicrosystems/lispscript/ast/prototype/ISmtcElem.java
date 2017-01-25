package agsmicrosystems.lispscript.ast.prototype;

import agsmicrosystems.lispscript.interp.InterpEnv;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public interface ISmtcElem {

    public IValueLiteral evaluate(InterpEnv env);
}
