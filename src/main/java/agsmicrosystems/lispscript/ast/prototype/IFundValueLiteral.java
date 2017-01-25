package agsmicrosystems.lispscript.ast.prototype;

/**
 * Created by zhangyutong926 on 1/24/17.
 */
public interface IFundValueLiteral extends IValueLiteral {

    public EFundType getFundType();

    /*
     * Without the prefix #
     */
    public String getLiteralConstructorRegex();
}
