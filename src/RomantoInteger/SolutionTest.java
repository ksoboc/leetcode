package RomantoInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();
    @Test
    void test() {
        assertEquals(3, solution.romanToInt("III") );
    }

    @Test
    void test2() {
        assertEquals(58, solution.romanToInt("LVIII") );
    }

    @Test
    void test3() {
        assertEquals(1994, solution.romanToInt("MCMXCIV") );
    }

}