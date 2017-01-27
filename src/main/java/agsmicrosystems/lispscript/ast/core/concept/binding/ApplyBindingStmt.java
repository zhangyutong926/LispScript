package agsmicrosystems.lispscript.ast.core.concept.binding;

import agsmicrosystems.lispscript.ast.prototype.AStmtElem;
import agsmicrosystems.lispscript.ast.prototype.ISmtcElem;
import agsmicrosystems.lispscript.ast.prototype.IFundValue;
import agsmicrosystems.lispscript.interp.InterpEnv;

import java.util.List;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public class ApplyBindingStmt extends AStmtElem {

    private String bindingName;

    protected ApplyBindingStmt(List<ISmtcElem> childSmtcList) {
        super(childSmtcList);
        // TODO
    }

    @Override
    public IFundValue evaluate(InterpEnv env) {
        // TODO
        return null;
    }

    @Override
    protected IFundValue evaluateThis(InterpEnv env, List<ISmtcElem> children) {
        return null;
    }


    public String getBindingName() {
        return bindingName;
    }

    @Override
    public String getStmtTag() {
        return null;
    }
}
