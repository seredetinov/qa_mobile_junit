import org.junit.*;
import static org.junit.Assert.*;

public class TestsGeneral {

    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }

    @Test
    public void testConstructor(){
        Rational rational = new Rational(1,2);
        assertEquals("Constructor returns wrong numerator", 1, rational.getNumerator());
        assertEquals("Constructor returns wrong denominator", 2, rational.getDenominator());
    }

    @Test
    public void testZeroDenominatorConstructor(){
        ArithmeticException arithmeticException = assertThrows(ArithmeticException.class, () -> {
            Rational rational = new Rational(1,0);
        });
        assertEquals("division by zero !", arithmeticException.getMessage());
    }

    @Test
    public void testReductionRational(){
        Rational rational = new Rational(10,20);
        assertEquals("The numerator was not reduced", 1, rational.getNumerator());
        assertEquals("The denominator was not reduced", 2, rational.getDenominator());
    }

    @Test
    public void testMinusBeforeNumerator(){
        Rational rational = new Rational(1,-2);
        assertEquals("The minus does not come before the numerator", -1, rational.getNumerator());
        assertEquals("The minus in front of the denominator remains", 2, rational.getDenominator());
    }

    @Test
    public void testToString(){
        Rational rational = new Rational(1,2);
        assertEquals("The created fraction is not displayed in the correct format","1/2",rational.toString());
    }

    @Test
    public void testSetNumerator(){
        Rational rational = new Rational();
        rational.setNumerator(5);
        assertEquals("The numerator was not set",5,rational.getNumerator());
    }

    @Test
    public void testSetDenominator(){
        Rational rational = new Rational(1,1);
        rational.setDenominator(5);
        assertEquals("The numerator was not set",5,rational.getDenominator());
    }

}