package seminars.third.hw;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvenOddNumberTest {

    @Test
    public void testEvenNumber() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertTrue(evenOddNumber.evenOddNumber(2));
        assertTrue(evenOddNumber.evenOddNumber(0));
        assertTrue(evenOddNumber.evenOddNumber(-4));
        assertTrue(evenOddNumber.evenOddNumber(100));
    }

    @Test
    public void testOddNumber() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertFalse(evenOddNumber.evenOddNumber(1));
        assertFalse(evenOddNumber.evenOddNumber(-3));
        assertFalse(evenOddNumber.evenOddNumber(101));
    }

    @Test
    public void testNegativeEvenNumber() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertTrue(evenOddNumber.evenOddNumber(-2));
    }

    @Test
    public void testZero() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertTrue(evenOddNumber.evenOddNumber(0));
    }

    @Test
    public void testPositiveEvenNumber() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertTrue(evenOddNumber.evenOddNumber(4));
    }
}