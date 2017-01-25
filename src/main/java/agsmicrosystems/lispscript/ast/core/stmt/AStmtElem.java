package agsmicrosystems.lispscript.ast.core.stmt;

import agsmicrosystems.lispscript.ast.prototype.ISmtcElem;
import agsmicrosystems.lispscript.ast.prototype.IStmtElem;
import agsmicrosystems.lispscript.ast.prototype.IValue;
import agsmicrosystems.lispscript.interp.InterpEnv;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public abstract class AStmtElem implements IStmtElem {

    private List<ISmtcElem> childSmtcList = new ArrayList<>();

    @Override
    public IValue evaluate(InterpEnv env) {
        return evaluateThis(env, childSmtcList);
    }

    @Override
    public List<ISmtcElem> getChildSmtcList() {
        return null;
    }

    protected abstract IValue evaluateThis(InterpEnv env, List<ISmtcElem> children);

    protected AStmtElem(List<ISmtcElem> childSmtcList) {
        this.childSmtcList = childSmtcList;
    }
}
