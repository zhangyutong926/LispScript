package agsmicrosystems.lispscript.ast.core.value.fundliteral;

import agsmicrosystems.lispscript.ast.prototype.EFundType;
import agsmicrosystems.lispscript.ast.prototype.IFundValueLiteral;
import agsmicrosystems.lispscript.data.Config;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by zhangyutong926 on 1/25/17.
 */
public class RationalLiteral implements IFundValueLiteral {

    private BigInteger numeratorValue;
    private BigInteger denominatorValue;

    @Override
    public EFundType getFundType() {
        return EFundType.RATIONAL;
    }

    @Override
    public String getLiteralConstructorRegex() {
        return "((0x([A-F]|[a-f]|[0-9])+)|(\\d+\\.\\d+)|(\\d+\\/\\d+)|(\\d))";
    }

    @Override
    public String getJavaValueDesc() {
        return "java.math.BigDecimal";
    }

    @Override
    public Object getValue() {
        return new BigDecimal(numeratorValue).divide(new BigDecimal(denominatorValue), Config.roundingMode);
    }

    @Override
    public String getConstructorKeyword() {
        return null;
    }

    public RationalLiteral(BigInteger integerValue) {
        numeratorValue = integerValue;
        denominatorValue = BigInteger.ONE;
    }

    public RationalLiteral(BigInteger numeratorValue, BigInteger denominatorValue) {
        this.numeratorValue = numeratorValue;
        this.denominatorValue = denominatorValue;
    }

    public BigInteger getNumeratorValue() {
        return numeratorValue;
    }

    public BigInteger getDenominatorValue() {
        return denominatorValue;
    }
}
