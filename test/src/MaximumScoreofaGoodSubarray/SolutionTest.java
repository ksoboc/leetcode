package MaximumScoreofaGoodSubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums = {1,4,3,7,4,5};
        var res = solution.maximumScore(nums,3);
        assertEquals(15,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] nums = {5,5,4,5,4,1,1,1};
        var res = solution.maximumScore(nums,0);
        assertEquals(20,res);
    }

}