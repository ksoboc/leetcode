package MinimumSizeSubarraySum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        var target = 7;
        int[] nums = {2,3,1,2,4,3};
        Solution solution = new Solution();
        assertEquals(2,solution.minSubArrayLen(target,nums));

    }

    @Test
    void test2() {
        var target = 15;
        int[] nums = {1,2,3,4,5};
        Solution solution = new Solution();
        assertEquals(5,solution.minSubArrayLen(target,nums));

    }
}