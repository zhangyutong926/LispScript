package agsmicrosystems.lispscript.ast.core.stmt;

import agsmicrosystems.lispscript.ast.prototype.ISmtcElem;
import agsmicrosystems.lispscript.ast.prototype.IValueLiteral;
import agsmicrosystems.lispscript.interp.InterpEnv;

import java.util.List;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public class DefValueElem extends AStmtElem {

    @Override
    public String getStmtTag() {
        return "defval";
    }

    @Override
    protected IValueLiteral evaluateThis(InterpEnv env, List<ISmtcElem> children) {
        // TODO
        return null;
    }

    public DefValueElem(List<ISmtcElem> childSmtcList) {
        super(childSmtcList);
    }
}
