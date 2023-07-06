package MinimumSizeSubarraySum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(2,solution.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(1,solution.minSubArrayLen(4,new int[]{1,4,4}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(0,solution.minSubArrayLen(11,new int[]{1,1,1,1,1,1,1,1}));
    }

}