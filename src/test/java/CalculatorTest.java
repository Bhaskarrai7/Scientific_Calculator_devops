//import Calculator;
import static org.junit.Assert.*;

import org.apache.logging.log4j.core.pattern.NotANumber;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void truepositivefactorial(){
        assertEquals("Adding two integer numbers for True Positive", 6, calculator.Factorial(3), DELTA);
        assertEquals("Adding two double numbers for True Positive", 120, calculator.Factorial(5), DELTA);
    }

    @Test
    public void truepositivesquareroot(){
        assertEquals("Adding two integer numbers for False Positive", 8, calculator.squareroot(64), DELTA);
        assertEquals("Adding two double numbers for False Positive", 3, calculator.squareroot(9), DELTA);
    }

    @Test
    public void TrueNegativeFactorial(){
        assertEquals("Subtracting two integer numbers for True Positive",Double.NaN, calculator.Factorial(-9), DELTA);
        assertEquals("Subtracting two double numbers for True Positive", 1, calculator.Factorial(0), DELTA);
    }

    @Test
    public void FalsePositivefactorial(){
        assertNotEquals("Checking for False Factorial Value", 4, calculator.Factorial(2),DELTA);
        assertNotEquals("Checking for False Factorial Value", 75, calculator.Factorial(8), DELTA);
    }

    @Test
    public void SquareRootFalsePositive(){
        assertNotEquals("Multiplying two integer numbers for True Positive", 4, calculator.squareroot(9), DELTA);
        assertNotEquals("Multiplying two double numbers for True Positive", 6, calculator.squareroot(16), DELTA);
    }

    @Test
    public void naturallogFalsePositive(){
        assertNotEquals("Multiplying two integer numbers for False Positive", 2.154, calculator.naturallog(8), DELTA);
        assertNotEquals("Multiplying two double numbers for False Positive", 7.3, calculator.naturallog(46), DELTA);
    }

    @Test
    public void powertruepositive(){
        assertEquals("Dividing two integer numbers for True Positive", 4, calculator.powofnum(2, 2), DELTA);
        assertEquals("Dividing two double numbers for True Positive", 1, calculator.powofnum(0, 0), DELTA);
        assertEquals("Dividing two double numbers for True Positive", Double.NaN, calculator.powofnum(1, Double.POSITIVE_INFINITY), DELTA);
        assertEquals("Dividing two double numbers for True Positive", Double.NaN, calculator.powofnum(1, Double.NEGATIVE_INFINITY), DELTA);
    }

    @Test
    public void naturallog(){
        assertNotEquals("Dividing two integer numbers for True Positive", 1, calculator.naturallog(9), DELTA);
        assertNotEquals("Dividing two double numbers for True Positive", 0, calculator.naturallog(8), DELTA);
        assertNotEquals("Dividing two double numbers for True Positive", 1, calculator.naturallog(Double.POSITIVE_INFINITY), DELTA);
        //assertNotEquals("Dividing two double numbers for True Positive", -1, calculator.divide(-1, 0), DELTA);
    }


}