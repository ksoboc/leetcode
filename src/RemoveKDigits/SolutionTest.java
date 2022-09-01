package RemoveKDigits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void prepare() {
        solution = new Solution();
    }

    @Test
    void test() {
        System.out.println("solution.removeKdigits(\"1432219\", 3) = " + solution.removeKdigits("1432219", 3));
        assertEquals("1219", solution.removeKdigits("1432219", 3));
    }

    @Test
    void test2() {
        System.out.println("solution.removeKdigits(\"10200\", 1) = " + solution.removeKdigits("10200", 1));
        assertEquals("200",solution.removeKdigits("10200", 1));
    }

    @Test
    void test3() {
        System.out.println("solution.removeKdigits(\"10\", 2) = " + solution.removeKdigits("10", 2));
        assertEquals("0", solution.removeKdigits("10", 2));
    }

    @Test
    void test4() {
        System.out.println("solution.removeKdigits(\"9\", 1) = " + solution.removeKdigits("9", 1));
        assertEquals("0", solution.removeKdigits("9", 1));
    }

}