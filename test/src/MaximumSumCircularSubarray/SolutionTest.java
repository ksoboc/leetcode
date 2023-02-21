package MaximumSumCircularSubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(3,solution.maxSubarraySumCircular(new int[]{1,-2,3,-2}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(10,solution.maxSubarraySumCircular(new int[]{5,-3,5}));
    }

}