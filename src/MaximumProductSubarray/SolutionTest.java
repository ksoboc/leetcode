package MaximumProductSubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        int[] nums = {2,3,-2,4};
        assertEquals(6, solution.maxProduct(nums));
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        int[] nums  = {-2,0,-1};
        assertEquals(0, solution.maxProduct(nums));
    }

}