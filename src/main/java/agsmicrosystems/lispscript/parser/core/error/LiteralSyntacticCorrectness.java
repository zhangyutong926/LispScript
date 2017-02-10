package agsmicrosystems.lispscript.parser.core.error;

/**
 * Created by zhangyutong926 on 2/10/17.
 */
public class LiteralSyntacticCorrectness {

    private boolean isSyntacticCorrect;
    private SyntaxErrorCode errorCode;
    private String errorMsg;

    public LiteralSyntacticCorrectness(boolean isSyntacticCorrect, SyntaxErrorCode errorCode, String errorMsg) {
        this.isSyntacticCorrect = isSyntacticCorrect;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public boolean isSyntacticCorrect() {
        return isSyntacticCorrect;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public SyntaxErrorCode getErrorCode() {
        return errorCode;
    }
}