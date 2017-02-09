package agsmicrosystems.lispscript.ast.core.value.internal;

import agsmicrosystems.lispscript.ast.prototype.EFundType;
import agsmicrosystems.lispscript.ast.prototype.IFundValue;

/**
 * A type designed to replace the return value of an impure function
 * Created by zhangyutong926 on 1/25/17.
 */
public class SideEffect implements IFundValue {

    @Override
    public EFundType getFundType() {
        return EFundType.SIDE_EFFECT;
    }
}
