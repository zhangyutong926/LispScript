package agsmicrosystems.lispscript.ast.core.value.fundliteral;

import agsmicrosystems.lispscript.ast.prototype.EFundType;
import agsmicrosystems.lispscript.ast.prototype.IFundValueLiteral;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public class BoolLiteral implements IFundValueLiteral {

    private Boolean value;

    @Override
    public EFundType getFundType() {
        return EFundType.BOOL;
    }

    @Override
    public String getLiteralConstructorRegex() {
        return "true|false";
    }

    @Override
    public String getJavaValueDesc() {
        return "java.lang.Boolean";
    }

    @Override
    public Boolean getValue() {
        return value;
    }

    @Override
    public String getConstructorKeyword() {
        return "mkbool";
    }

    public BoolLiteral(boolean value) {
        this.value = value;
    }
}
