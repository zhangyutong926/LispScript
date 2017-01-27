package agsmicrosystems.lispscript.ast.core.value.fund.factory;

import agsmicrosystems.lispscript.ast.prototype.EFundType;
import agsmicrosystems.lispscript.ast.prototype.IFundValue;
import agsmicrosystems.lispscript.ast.prototype.IFundValueLiteralFactory;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public class StringLiteralFactory implements IFundValueLiteralFactory {

    @Override
    public EFundType getFundType() {
        return EFundType.STRING;
    }

    @Override
    public LiteralSyntaxCorrectness isSyntaxCorrect(String codeSegment) {
        return null;
    }

    @Override
    public String getLiteralConstructorRegex() {
        return "\\\".*\\\"";
    }

    @Override
    public String getConstructorKeyword() {
        return "mkstr";
    }

    @Override
    public IFundValue createValueFromCodeSeg(String codeSegment) {
        return null;
    }
}
