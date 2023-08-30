package MinimumReplacementstoSorttheArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums = {3,9,3};
        var res = solution.minimumReplacement(nums);
        assertEquals(2,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] nums = {1,2,3,4,5};
        var res = solution.minimumReplacement(nums);
        assertEquals(0,res);
    }
    //
    @Test
    void test3() {
        Solution solution=new Solution();
        int[] nums = {2,10,20,19,1};
        var res = solution.minimumReplacement(nums);
        assertEquals(47,res);
    }
    //
    @Test
    void test4() {
        Solution solution=new Solution();
        int[] nums = {12,9,7,6,17,19,21};
        var res = solution.minimumReplacement(nums);
        assertEquals(6,res);
    }

}