package agsmicrosystems.lispscript.ast.core.value.fundliteral;

import agsmicrosystems.lispscript.ast.prototype.EFundType;
import agsmicrosystems.lispscript.ast.prototype.IFundValueLiteral;
import agsmicrosystems.lispscript.ast.prototype.IValueLiteral;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public class StringLiteral implements IFundValueLiteral {

    private String value;

    @Override
    public EFundType getFundType() {
        return EFundType.STRING;
    }

    @Override
    public String getLiteralConstructorRegex() {
        return "\\\".*\\\"";
    }

    @Override
    public String getJavaValueDesc() {
        return "java.lang.String";
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public String getConstructorKeyword() {
        return "mkstr";
    }

    public StringLiteral(String value) {
        this.value = value;
    }
}
