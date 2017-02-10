package agsmicrosystems.lispscript.parser.core.value.fund;

import agsmicrosystems.lispscript.ast.prototype.EFundType;
import agsmicrosystems.lispscript.ast.prototype.IFundValue;
import agsmicrosystems.lispscript.parser.core.error.LiteralSyntacticCorrectness;

/**
 * Created by zhangyutong926 on 1/26/17.
 */
public class FunctionLiteralParser implements IFundValueLiteralParser {

    @Override
    public EFundType getFundType() {
        return EFundType.FUNCTION;
    }

    @Override
    public LiteralSyntacticCorrectness isSyntaxCorrect(String codeSegment) {
        return null;
    }

    @Override
    public String getLiteralConstructorRegex() {
        return "\\{(([^\\{\\}\\=\\-\\>]+->[^\\{\\}\\=\\-\\>]+=[^\\{\\}\\=\\-\\>]+)|([^\\{\\}\\=\\-\\>]+=[^\\{\\}\\=\\-\\>]+))\\}";
    }

    @Override
    public String getConstructorKeyword() {
        return "mkfun";
    }

    @Override
    public IFundValue createValueFromCodeSeg(String codeSegment) {
        // TODO
        return null;
    }
}
