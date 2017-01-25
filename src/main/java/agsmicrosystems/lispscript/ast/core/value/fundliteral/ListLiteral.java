package agsmicrosystems.lispscript.ast.core.value.fundliteral;

import agsmicrosystems.lispscript.ast.prototype.EFundType;
import agsmicrosystems.lispscript.ast.prototype.IFundValueLiteral;
import agsmicrosystems.lispscript.ast.prototype.IValueLiteral;

import java.util.List;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public class ListLiteral implements IFundValueLiteral {

    private List<IValueLiteral> value;

    @Override
    public EFundType getFundType() {
        return EFundType.LIST;
    }

    @Override
    public String getLiteralConstructorRegex() {
        return "\\[.*\\]";
    }

    @Override
    public String getJavaValueDesc() {
        return "java.util.List";
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public String getConstructorKeyword() {
        return "mklist";
    }

    public ListLiteral(List<IValueLiteral> value) {
        this.value = value;
    }

    public ListLiteral() {
    }
}
