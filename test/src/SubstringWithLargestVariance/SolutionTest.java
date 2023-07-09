package SubstringWithLargestVariance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.largestVariance("aababbb");
        assertEquals(3,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.largestVariance("abcde");
        assertEquals(0,res);
    }

}