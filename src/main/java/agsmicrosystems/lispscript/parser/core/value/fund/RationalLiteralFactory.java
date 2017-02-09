package agsmicrosystems.lispscript.parser.core.value.fund;

import agsmicrosystems.lispscript.ast.prototype.EFundType;
import agsmicrosystems.lispscript.ast.prototype.IFundValue;
import agsmicrosystems.lispscript.parser.prototype.IFundValueLiteralFactory;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public class RationalLiteralFactory implements IFundValueLiteralFactory {

    @Override
    public EFundType getFundType() {
        return EFundType.RATIONAL;
    }

    @Override
    public LiteralSyntaxCorrectness isSyntaxCorrect(String codeSegment) {
        return null;
    }

    @Override
    public String getLiteralConstructorRegex() {
        return "((0x([A-F]|[a-f]|[0-9])+)|(\\d+\\.\\d+)|(\\d+\\/\\d+)|(\\d))";
    }

    @Override
    public String getConstructorKeyword() {
        return "mkrat";
    }

    @Override
    public IFundValue createValueFromCodeSeg(String codeSegment) {
        // TODO
        return null;
    }
}
