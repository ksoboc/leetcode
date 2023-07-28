package PredicttheWinner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums = {1,5,2};
        var res = solution.PredictTheWinner(nums);
        assertFalse(res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] nums = {1,5,233,7};
        var res = solution.PredictTheWinner(nums);
        assertTrue(res);
    }

    @Test
    void test3() {
        Solution solution=new Solution();
        int[] nums = {1,567,1,1,99,100};
        var res = solution.PredictTheWinner(nums);
        assertTrue(res);
    }
}