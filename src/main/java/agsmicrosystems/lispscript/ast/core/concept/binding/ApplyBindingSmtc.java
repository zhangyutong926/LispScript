package agsmicrosystems.lispscript.ast.core.concept.binding;

import agsmicrosystems.lispscript.ast.prototype.ISmtcElem;
import agsmicrosystems.lispscript.ast.prototype.IValue;
import agsmicrosystems.lispscript.interp.InterpEnv;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public class ApplyBindingSmtc implements ISmtcElem {

    private String bindingName;

    @Override
    public IValue evaluate(InterpEnv env) {
        // TODO
        return null;
    }

    public ApplyBindingSmtc(String bindingName) {
        this.bindingName = bindingName;
    }

    public String getBindingName() {
        return bindingName;
    }
}
