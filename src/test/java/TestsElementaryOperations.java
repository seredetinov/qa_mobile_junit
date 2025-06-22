import org.junit.*;
import static org.junit.Assert.*;

public class TestsElementaryOperations {

    private static Rational firstPositiveFraction;
    private static Rational secondPositiveFraction;
    private static Rational zeroFraction;
    private static Rational firstNegativeFraction;
    private static Rational secondNegativeFraction;
    private static Rational unitFraction;
    private static String msgPlus;
    private static String msgMultiply;
    private static String msgMinus;
    private static String msgDivide;

    @BeforeClass
    public static void setup() {
        firstPositiveFraction = new Rational(1, 2);
        secondPositiveFraction = new Rational(3,4);
        zeroFraction = new Rational(0,1);
        firstNegativeFraction = new Rational(-2,3);
        secondNegativeFraction = new Rational(-4,5);
        unitFraction = new Rational(1,1);

        msgPlus = "The sum of first term and second term is not equal to the correct value";
        msgMultiply = "The product of first multiplier and second multiplier is not equal to the correct value";
        msgMinus = "The difference of minuend and subtrahend is not equal to the correct value";
        msgDivide = "The quotient of dividend and divider is not equal to the correct value";
    }

    @Test
    public void testPlus_PositiveAndPositive () {
        assertEquals(msgPlus, "5/4", firstPositiveFraction.plus(secondPositiveFraction).toString());
    }

    @Test
    public void testPlus_PositiveAndNegative () {
        assertEquals(msgPlus, "-1/6", firstPositiveFraction.plus(firstNegativeFraction).toString());
    }

    @Test
    public void testPlus_NegativeAndPositive () {
        assertEquals(msgPlus, "-1/6", firstNegativeFraction.plus(firstPositiveFraction).toString());
    }

    @Test
    public void testPlus_NegativeAndNegative () {
        assertEquals(msgPlus, "-22/15", firstNegativeFraction.plus(secondNegativeFraction).toString());
    }

    @Test
    public void testPlus_PlusZero() {
        assertEquals(msgPlus, firstPositiveFraction.toString(), firstPositiveFraction.plus(zeroFraction).toString());
    }

    @Test
    public void testPlus_ZeroPlus() {
        assertEquals(msgPlus, firstPositiveFraction.toString(), zeroFraction.plus(firstPositiveFraction).toString());
    }

    @Test
    public void testMultiply_PositiveAndPositive () {
        assertEquals(msgMultiply, "3/8", firstPositiveFraction.multiply(secondPositiveFraction).toString());
    }

    @Test
    public void testMultiply_PositiveAndNegative () {
        assertEquals(msgMultiply, "-1/3", firstPositiveFraction.multiply(firstNegativeFraction).toString());
    }

    @Test
    public void testMultiply_NegativeAndPositive () {
        assertEquals(msgMultiply, "-1/3", firstNegativeFraction.multiply(firstPositiveFraction).toString());
    }

    @Test
    public void testMultiply_NegativeAndNegative () {
        assertEquals(msgMultiply, "8/15", firstNegativeFraction.multiply(secondNegativeFraction).toString());
    }

    @Test
    public void testMultiply_MultiplyByZero() {
        assertEquals(msgMultiply, 0, firstPositiveFraction.multiply(zeroFraction).getNumerator());
    }

    @Test
    public void testMultiply_MultiplyOfZero() {
        assertEquals(msgMultiply, 0, zeroFraction.multiply(firstPositiveFraction).getNumerator());
    }

    @Test
    public void testMultiply_MultiplyByUnit() {
        assertEquals(msgMultiply, firstPositiveFraction.toString(), firstPositiveFraction.multiply(unitFraction).toString());
    }

    @Test
    public void testMultiply_MultiplyOfUnit() {
        assertEquals(msgMultiply, firstPositiveFraction.toString(), unitFraction.multiply(firstPositiveFraction).toString());
    }

    @Test
    public void testMinus_PositiveAndPositive () {
        assertEquals(msgMinus,"-1/4", firstPositiveFraction.minus(secondPositiveFraction).toString());
    }

    @Test
    public void testMinus_PositiveAndNegative () {
        assertEquals(msgMinus,"7/6", firstPositiveFraction.minus(firstNegativeFraction).toString());
    }

    @Test
    public void testMinus_NegativeAndPositive () {
        assertEquals(msgMinus,"-7/6", firstNegativeFraction.minus(firstPositiveFraction).toString());
    }

    @Test
    public void testMinus_NegativeAndNegative () {
        assertEquals(msgMinus,"2/15", firstNegativeFraction.minus(secondNegativeFraction).toString());
    }

    @Test
    public void testMinus_ZeroSubtrahend () {
        assertEquals(msgMinus,firstPositiveFraction.toString(), firstPositiveFraction.minus(zeroFraction).toString());
    }

    @Test
    public void testMinus_ZeroMinuend () {
        assertEquals(msgMinus,"-" + firstPositiveFraction.toString(), zeroFraction.minus(firstPositiveFraction).toString());
    }

    @Test
    public void testDivide_PositiveAndPositive () {
        assertEquals(msgDivide, "2/3", firstPositiveFraction.divide(secondPositiveFraction).toString());
    }

    @Test
    public void testDivide_PositiveAndNegative () {
        assertEquals(msgDivide, "-3/4", firstPositiveFraction.divide(firstNegativeFraction).toString());
    }

    @Test
    public void testDivide_NegativeAndPositive () {
        assertEquals(msgDivide, "-4/3", firstNegativeFraction.divide(firstPositiveFraction).toString());
    }

    @Test
    public void testDivide_NegativeAndNegative () {
        assertEquals(msgDivide, "5/6", firstNegativeFraction.divide(secondNegativeFraction).toString());
    }

    @Test
    public void testDivide_ZeroDividend () {
        assertEquals(msgDivide, 0, zeroFraction.divide(firstPositiveFraction).getNumerator());
    }

    @Test
    public void testDivide_ZeroDivider () {
        ArithmeticException arithmeticException = assertThrows(ArithmeticException.class, () -> {
            firstPositiveFraction.divide(zeroFraction);
        });
        assertEquals("division by zero !", arithmeticException.getMessage());

    }

    @Test
    public void testDivide_UnitDividend () {
        assertEquals(msgDivide, "4/3", unitFraction.divide(secondPositiveFraction).toString());
    }

    @Test
    public void testDivide_UnitDivider () {
        assertEquals(msgDivide, firstPositiveFraction.toString(), firstPositiveFraction.divide(unitFraction).toString());
    }

}
