package ZigzagConversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        var res = solution.convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR",res);
    }
    @Test
    void test2() {
        var res = solution.convert("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI",res);
    }

}