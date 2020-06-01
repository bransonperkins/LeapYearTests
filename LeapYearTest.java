import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class LeapYearTest {
    
    @Test
    public void isItALeapYearDivisibleBy400() {
        assertTrue(LeapYear.isLeapYear(2000));
    }

    @Test
    public void isItALeapYearDivisibleBy4() {
        assertTrue(LeapYear.isLeapYear(1996));
    }

    @Test
    public void divisibleBy100ButNot400ThrowsAnException() {
        assertFalse(LeapYear.isLeapYear(1900));
    }

    // throw an exception when the number entered is negative (invalid)
    @Test(expected = RuntimeException.class)
    public final void throwAnExceptionIfTheNumberIsNegative() {
        LeapYear.isLeapYear(-2020);
    }
}