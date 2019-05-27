import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.addValues(2,3));
    }

    @Test
    public void testSubtract() {
        assertEquals(7, calculator.subtractValues(12,5));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiplyValues(3,5));
    }

    @Test
    public void testDivide() {
        assertEquals(1.5, calculator.divideValues(3,2), 0.1);
    }
}
