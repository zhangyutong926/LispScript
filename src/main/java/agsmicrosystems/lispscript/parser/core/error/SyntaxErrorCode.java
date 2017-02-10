package agsmicrosystems.lispscript.parser.core.error;

/**
 * Created by zhangyutong926 on 2/10/17.
 * FIXME Enumeration for mapping, especially int -> String mapping, BAD PRACTICE
 */
public enum SyntaxErrorCode {

    NO_ERROR(0, ""),
    UNKNOWN_ERROR(-1, "Internal unknown error, please contact the compiler author.");

    private int code;
    private String message;

    SyntaxErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static SyntaxErrorCode codeInstanceFromCode(int code) {
        for (SyntaxErrorCode item : values()) {
            if (item.code == code) return item;
        }
        return UNKNOWN_ERROR;
    }
}
