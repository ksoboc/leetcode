package DecodeWays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test226() {
        var res = solution.numDecodings("226");
        assertEquals(3,res);
    }
    @Test
    void test12() {
        var res = solution.numDecodings("12");
        assertEquals(2,res);
    }
    @Test
    void test06() {
        var res = solution.numDecodings("06");
        assertEquals(0,res);
    }
    @Test
    void test1201234() {
        var res = solution.numDecodings("1201234");
        assertEquals(3,res);
    }

}