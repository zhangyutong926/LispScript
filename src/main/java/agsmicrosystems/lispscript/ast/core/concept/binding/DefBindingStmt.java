package agsmicrosystems.lispscript.ast.core.concept.binding;

import agsmicrosystems.lispscript.ast.prototype.AStmtElem;
import agsmicrosystems.lispscript.ast.prototype.ISmtcElem;
import agsmicrosystems.lispscript.ast.prototype.IFundValue;
import agsmicrosystems.lispscript.interp.InterpEnv;

import java.util.List;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public class DefBindingStmt extends AStmtElem {

    @Override
    public String getStmtTag() {
        return "def";
    }

    public DefBindingStmt(List<ISmtcElem> childSmtcList) {
        super(childSmtcList);
    }
}
