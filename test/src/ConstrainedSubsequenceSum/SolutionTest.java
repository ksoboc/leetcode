package ConstrainedSubsequenceSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        int[] nums = {10,2,-10,5,20};
        Solution solution=new Solution();
        var res=solution.constrainedSubsetSum(nums,2);
        assertEquals(37,res);
    }
    @Test
    void test2() {
        int[] nums = {-1,-2,-3};
        Solution solution=new Solution();
        var res=solution.constrainedSubsetSum(nums,1);
        assertEquals(-1,res);
    }
    @Test
    void test3() {
        int[] nums = {10,-2,-10,-5,20};
        Solution solution=new Solution();
        var res=solution.constrainedSubsetSum(nums,2);
        assertEquals(23,res);
    }

    //
    @Test
    void test4() {
        int[] nums = {-8269,3217,-4023,-4138,-683,6455,-3621,9242,4015,-3790};
        Solution solution=new Solution();
        var res=solution.constrainedSubsetSum(nums,1);
        assertEquals(16091,res);
    }
}