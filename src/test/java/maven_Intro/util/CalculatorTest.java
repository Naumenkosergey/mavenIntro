package maven_Intro.util;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CalculatorTest {
    private  Calculator calc=new Calculator();

    @Test
    public void checkAdd(){

        BigDecimal a = BigDecimal.valueOf(2.5);
        BigDecimal b = BigDecimal.valueOf(2.3);

        BigDecimal actual = calc.add(a,b);
        BigDecimal expected = BigDecimal.valueOf(4.8);
        Assert.assertEquals(expected,actual);
    }

}