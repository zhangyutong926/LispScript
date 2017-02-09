package agsmicrosystems.lispscript.ast.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public abstract class AStmtElem implements IStmtElem {

    public List<ISmtcElem> childSmtcList = new ArrayList<>();

    @Override
    public List<ISmtcElem> getChildSmtcList() {
        return null;
    }

    protected AStmtElem(List<ISmtcElem> childSmtcList) {
        this.childSmtcList = childSmtcList;
    }
}
