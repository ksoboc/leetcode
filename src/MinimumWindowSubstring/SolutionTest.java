package MinimumWindowSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res = solution.minWindow("ADOBECODEBANC","ABC");
        System.out.println("res = " + res);
        assertEquals("BANC",res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res = solution.minWindow("a","a");
        System.out.println("res = " + res);
        assertEquals("a", res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        var res = solution.minWindow("a","aa");
        System.out.println("res = " + res);
        assertEquals("",res);
    }
    @Test
    void test4() {
        Solution solution=new Solution();

        var res = solution.minWindow("ab","a");
        System.out.println("res = " + res);
        assertEquals("a",res);
    }

}