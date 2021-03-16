//import Calculator;
import static org.junit.Assert.*;

import org.apache.logging.log4j.core.pattern.NotANumber;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void truepositivefactorial(){
        assertEquals("Checking FACTORIAL for True Positive", 6, calculator.Factorial(3), DELTA);
        assertEquals("Checking FACTORIAL for True Positive", 120, calculator.Factorial(5), DELTA);
        assertEquals("Checking FACTORIAL for True Positive", Double.NaN, calculator.Factorial(5.6), DELTA);
    }

    @Test
    public void truepositivesquareroot(){
        assertEquals("Checking SQUAREROOT for True Positive", 8, calculator.squareroot(64), DELTA);
        assertEquals("Checking SQUAREROOT for True Positive", 3, calculator.squareroot(9), DELTA);
    }

    @Test
    public void TrueNegativeFactorial(){
        assertEquals("Checking FACTORIAL for True Negative",Double.NaN, calculator.Factorial(-9), DELTA);
        assertEquals("Checking FACTORIAL for True Negative", 1, calculator.Factorial(0), DELTA);
    }

    @Test
    public void FalsePositivefactorial(){
        assertNotEquals("Checking FACTORIAL for False Positive", 4, calculator.Factorial(2),DELTA);
        assertNotEquals("Checking FACTORIAL for False Positive", 75, calculator.Factorial(8), DELTA);
    }

    @Test
    public void SquareRootFalsePositive(){
        assertNotEquals("Checking SQUAREROOT for False Positive", 4, calculator.squareroot(9), DELTA);
        assertNotEquals("Checking SQUAREROOT for False Positive", 6, calculator.squareroot(16), DELTA);
    }

    @Test
    public void naturallogFalsePositive(){
        assertNotEquals("Checking NATURALLOG for False Positive", 2.154, calculator.naturallog(8), DELTA);
        assertNotEquals("Checking NATURALLOG for False Positive", 7.3, calculator.naturallog(46), DELTA);
    }

    @Test
    public void powertruepositive(){
        assertEquals("Checking POWER for True Positive", 4, calculator.powofnum(2, 2), DELTA);
        assertEquals("Checking POWER for True Positive", 1, calculator.powofnum(0, 0), DELTA);
        assertEquals("Checking POWER for True Positive", Double.NaN, calculator.powofnum(1, Double.POSITIVE_INFINITY), DELTA);
        assertEquals("Checking POWER for True Positive", Double.NaN, calculator.powofnum(1, Double.NEGATIVE_INFINITY), DELTA);
    }

    @Test
    public void naturallogfalsenegative(){
        assertNotEquals("Checking NATURALLOG for False Negative", 1, calculator.naturallog(9), DELTA);
        assertNotEquals("Checking NATURALLOG for False Negative", 0, calculator.naturallog(8), DELTA);
        assertNotEquals("Checking NATURALLOG for False Negative", 1, calculator.naturallog(Double.POSITIVE_INFINITY), DELTA);
    }


}