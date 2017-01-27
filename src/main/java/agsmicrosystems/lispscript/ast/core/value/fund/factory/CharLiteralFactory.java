package agsmicrosystems.lispscript.ast.core.value.fund.factory;

import agsmicrosystems.lispscript.ast.prototype.EFundType;
import agsmicrosystems.lispscript.ast.prototype.IFundValueLiteralFactory;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public class CharLiteralFactory implements IFundValueLiteralFactory {

    @Override
    public EFundType getFundType() {
        return EFundType.CHAR;
    }

    @Override
    public LiteralSyntaxCorrectness isSyntaxCorrect(String codeSegment) {
        return null;
    }

    @Override
    public String getLiteralConstructorRegex() {
        return "\\'.\\'";
    }

    @Override
    public String getConstructorKeyword() {
        return "mkchar";
    }
}
