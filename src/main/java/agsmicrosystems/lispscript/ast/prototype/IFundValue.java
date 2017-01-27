package agsmicrosystems.lispscript.ast.prototype;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public interface IFundValue extends ISmtcElem {

    EFundType getFundType();

    /**
     * For special case model.FunctionLiteral, override for yourself
     * @return
     */
    @Override
    default IFundValue evaluate() {
        return this;
    }
}
