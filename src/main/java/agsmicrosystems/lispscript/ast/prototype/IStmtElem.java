package agsmicrosystems.lispscript.ast.prototype;

import java.util.List;

/**
 * Created by zhangyutong926 on 1/24/17.
 */
public interface IStmtElem extends ISmtcElem {

    public String getStmtTag();
    public List<ISmtcElem> getChildSmtcList();
}
