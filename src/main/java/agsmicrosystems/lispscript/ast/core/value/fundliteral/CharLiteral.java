package agsmicrosystems.lispscript.ast.core.value.fundliteral;

import agsmicrosystems.lispscript.ast.prototype.EFundType;
import agsmicrosystems.lispscript.ast.prototype.IFundValueLiteral;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public class CharLiteral implements IFundValueLiteral {

    private Character value;

    @Override
    public EFundType getFundType() {
        return EFundType.CHAR;
    }

    @Override
    public String getLiteralConstructorRegex() {
        return "\\'.\\'";
    }

    @Override
    public String getJavaValueDesc() {
        return "java.lang.Character";
    }

    @Override
    public Character getValue() {
        return value;
    }

    @Override
    public String getConstructorKeyword() {
        return "mkchar";
    }

    public CharLiteral(int utf8) {
        value = (char) utf8;
    }

    public CharLiteral(Character value) {
        this.value = value;
    }
}
