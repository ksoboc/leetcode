package SoupServings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.soupServings(50);
        assertEquals(0.62500,res,1e-5);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.soupServings(100);
        assertEquals(0.71875,res,1e-5);
    }

}