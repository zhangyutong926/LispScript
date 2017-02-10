package agsmicrosystems.lispscript.parser.core.value.fund;

import agsmicrosystems.lispscript.ast.prototype.EFundType;
import agsmicrosystems.lispscript.ast.prototype.IFundValue;
import agsmicrosystems.lispscript.parser.core.error.LiteralSyntacticCorrectness;

/**
 * Created by zhangyutong926 on 1/24/17.
 */
public interface IFundValueLiteralParser {

    EFundType getFundType();

    /**
     * Check the syntax correctness to a specific code segment that matches the literal constructor regex.
     * @param codeSegment The code segment waiting to be checked
     * @return Syntax correctness (if it is, )
     */
    LiteralSyntacticCorrectness isSyntaxCorrect(String codeSegment);

    /**
     * e.g. <code>\".*\"</code> for <code>#"HelloWorld"</code>, without #
     * @return
     */
    String getLiteralConstructorRegex();

    /**
     * e.g. <code>mkstr</code> in <code>(#mkstr "HelloWorld")</code>
     * @return
     */
    String getConstructorKeyword();

    /**
     * Create IFundValue instance from designated code segment.
     * @param codeSegment The code segment that matched the constructor regex and passed the syntax check
     * @return The instance of IFundValue
     */
    IFundValue createValueFromCodeSeg(String codeSegment);
}
