package SearchinRotatedSortedArrayII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums = {2,5,6,0,0,1,2};
        var res = solution.search(nums, 0);
        assertTrue(res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] nums = {2,5,6,0,0,1,2};
        var res = solution.search(nums, 3);
        assertFalse(res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[] nums = {1,0,1,1,1};
        var res = solution.search(nums, 0);
        assertTrue(res);
    }

}