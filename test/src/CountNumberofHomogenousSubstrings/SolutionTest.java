package CountNumberofHomogenousSubstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.countHomogenous("abbcccaa");
        assertEquals(13,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.countHomogenous("xy");
        assertEquals(2,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.countHomogenous("zzzzz");
        assertEquals(15,res);
    }

}