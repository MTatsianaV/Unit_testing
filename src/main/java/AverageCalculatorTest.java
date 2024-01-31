import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.six.AverageCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageCalculatorTest {
    private AverageCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new AverageCalculator();
    }

    @Test
    public void testCalculateAverage() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double expectedAverage = 3.0;
        double actualAverage = calculator.calculateAverage(numbers);
        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void testCompareAverages_FirstListHasGreaterAverage() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2);
        String expectedMessage = "Первый список имеет большее среднее значение";
        String actualMessage = calculator.compareAverages(list1, list2);
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testCompareAverages_SecondListHasGreaterAverage() {
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        String expectedMessage = "Второй список имеет большее среднее значение";
        String actualMessage = calculator.compareAverages(list1, list2);
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testCompareAverages_AveragesAreEqual() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        String expectedMessage = "Средние значения равны";
        String actualMessage = calculator.compareAverages(list1, list2);
        assertEquals(expectedMessage, actualMessage);
    }
}