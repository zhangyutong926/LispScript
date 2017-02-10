package agsmicrosystems.lispscript.parser.core.value.fund;

import agsmicrosystems.lispscript.ast.prototype.EFundType;
import agsmicrosystems.lispscript.ast.prototype.IFundValue;
import agsmicrosystems.lispscript.parser.core.error.LiteralSyntacticCorrectness;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public class ListLiteralParser implements IFundValueLiteralParser {

    @Override
    public EFundType getFundType() {
        return EFundType.LIST;
    }

    @Override
    public LiteralSyntacticCorrectness isSyntaxCorrect(String codeSegment) {
        return null;
    }

    @Override
    public String getLiteralConstructorRegex() {
        return "\\[.*\\]";
    }

    @Override
    public String getConstructorKeyword() {
        return "mklist";
    }

    @Override
    public IFundValue createValueFromCodeSeg(String codeSegment) {
        // TODO
        return null;
    }
}
