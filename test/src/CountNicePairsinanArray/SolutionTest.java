package CountNicePairsinanArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums = {42,11,1,97};
        assertEquals(2, solution.countNicePairs(nums));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] nums = {13,10,35,24,76};
        assertEquals(4, solution.countNicePairs(nums));
    }

}