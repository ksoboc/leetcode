package IntegertoRoman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();
    @Test
    void test() {
        assertEquals("LVIII", solution.intToRoman(58));
    }

    @Test
    void test2() {
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }

}