package agsmicrosystems.lispscript.ast.core.value.fund.factory;

import agsmicrosystems.lispscript.ast.prototype.EFundType;
import agsmicrosystems.lispscript.ast.prototype.IFundValueLiteralFactory;

/**
 * Created by zhangyutong926 on 1/26/17.
 */
public class FunctionLiteralFactory implements IFundValueLiteralFactory {

    @Override
    public EFundType getFundType() {
        return EFundType.FUNCTION;
    }

    @Override
    public LiteralSyntaxCorrectness isSyntaxCorrect(String codeSegment) {
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
}
