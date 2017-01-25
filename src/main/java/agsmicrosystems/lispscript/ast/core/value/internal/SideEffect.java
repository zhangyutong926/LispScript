package agsmicrosystems.lispscript.ast.core.value.internal;

import agsmicrosystems.lispscript.ast.prototype.IValue;

/**
 * A type designed to replace the return value of an impure function
 * Created by zhangyutong926 on 1/25/17.
 */
public class SideEffect implements IValue {

    @Override
    public String getJavaValueDesc() {
        return null;
    }

    @Override
    public Object getValue() {
        return null;
    }
}
