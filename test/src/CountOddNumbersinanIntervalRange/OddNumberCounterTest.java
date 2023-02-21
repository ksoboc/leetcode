package CountOddNumbersinanIntervalRange;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OddNumberCounterTest {
    @Test
    public void testCountOddNumbers1() {
        int low = 2;
        int high = 10;
        int expected = 4;
        int actual = OddNumberCounter.countOddNumbers(low, high);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountOddNumbers2() {
        int low = 1;
        int high = 10;
        int expected = 5;
        int actual = OddNumberCounter.countOddNumbers(low, high);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountOddNumbers3() {
        int low = 2;
        int high = 9;
        int expected = 4;
        int actual = OddNumberCounter.countOddNumbers(low, high);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountOddNumbers4() {
        int low = 1;
        int high = 9;
        int expected = 5;
        int actual = OddNumberCounter.countOddNumbers(low, high);
        assertEquals(expected, actual);
    }
}
