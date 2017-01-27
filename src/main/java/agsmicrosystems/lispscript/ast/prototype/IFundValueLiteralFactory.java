package agsmicrosystems.lispscript.ast.prototype;

/**
 * Created by zhangyutong926 on 1/24/17.
 */
public interface IFundValueLiteralFactory {

    class LiteralSyntaxCorrectness {
        private boolean isCorrent;
        private String errorMsg;

        public LiteralSyntaxCorrectness(boolean isCorrent, String errorMsg) {
            this.isCorrent = isCorrent;
            this.errorMsg = errorMsg;
        }

        public boolean isCorrent() {
            return isCorrent;
        }

        public String getErrorMsg() {
            return errorMsg;
        }
    }

    EFundType getFundType();

    /**
     * Check the syntax correctness to a specific code segment that matches the literal constructor regex.
     * @param codeSegment The code segment waiting to be checked
     * @return Syntax correctness (if it is, )
     */
    LiteralSyntaxCorrectness isSyntaxCorrect(String codeSegment);

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
