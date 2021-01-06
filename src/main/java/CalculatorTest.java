import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void SetUp(){
        calculator = new Calculator("Calc", 1, 2);
    }

    @Test
    public void hasName(){
        assertEquals("Calc", calculator.getName());
    }

    @Test
    public void hasNumber1(){
        assertEquals(1, calculator.getNumber1());
    }

    @Test
    public void hasNumber2(){
        assertEquals(2, calculator.getNumber2());
    }

    @Test
    public void hasAddFunction(){
        assertEquals(3, calculator.add());
    }

    @Test
    public void hasSubtractFunction(){
        assertEquals(-1, calculator.subtract());
    }

    @Test
    public void hasMultiplyFunction(){
        assertEquals(2, calculator.multiply());
    }

    @Test
    public void hasDivideFunction(){
        assertEquals(2, calculator.divide(4, 2), 0.1);
    }
}

