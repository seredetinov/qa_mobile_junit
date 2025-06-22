import org.junit.*;
import static org.junit.Assert.*;

public class TestsComparisons {

    private static Rational firstFraction;
    private static Rational secondFraction;

    @BeforeClass
    public static void setup(){
        firstFraction = new Rational(1,3);
        secondFraction = new Rational(1,2);
    }

    @Test
    public void testEquals_Equal(){
        assertTrue("The fraction is not equal to the same fraction",firstFraction.equals(firstFraction));
    }

    @Test
    public void testEquals_NotEqual(){
        assertFalse("The first fraction is false equal to the second fraction",firstFraction.equals(secondFraction));
    }

    @Test
    public void testLess_Less(){
        assertTrue("The smaller fraction is not less than the greater fraction",firstFraction.less(secondFraction));
    }

    @Test
    public void testLess_Equal(){
        assertFalse("The fraction is false less than the equal fraction",firstFraction.less(firstFraction));
    }

    @Test
    public void testLess_Greater(){
        assertFalse("The greater fraction is false less than the smaller fraction",secondFraction.less(firstFraction));
    }

    @Test
    public void testLessOrEqual_Less(){
        assertTrue("The smaller fraction is not less or equal than the greater fraction",firstFraction.lessOrEqual(secondFraction));
    }

    @Test
    public void testLessOrEqual_Equal() {
        assertTrue("The fraction is not less or equal than the equal fraction", firstFraction.lessOrEqual(firstFraction));
    }

    @Test
    public void testLessOrEqual_Greater() {
        assertFalse("The greater fraction is false less or equal than the smaller fraction", secondFraction.lessOrEqual(firstFraction));
    }

}
