package seminars.third.hw;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsTest {

    @Test
    public void testNumberInIntervalWithNumberLessThan25() {
        NumberUtils numberUtils = new NumberUtils();
        assertFalse(numberUtils.numberInInterval(15));
    }

    @Test
    public void testNumberInIntervalWithNumberGreaterThan100() {
        NumberUtils numberUtils = new NumberUtils();
        assertFalse(numberUtils.numberInInterval(150));
    }

    @Test
    public void testNumberInIntervalWithNumberEqualTo25() {
        NumberUtils numberUtils = new NumberUtils();
        assertFalse(numberUtils.numberInInterval(25));
    }

    @Test
    public void testNumberInIntervalWithNumberEqualTo100() {
        NumberUtils numberUtils = new NumberUtils();
        assertFalse(numberUtils.numberInInterval(100));
    }

    @Test
    public void testNumberInIntervalWithNumberInsideInterval() {
        NumberUtils numberUtils = new NumberUtils();
        assertTrue(numberUtils.numberInInterval(50));
    }
}