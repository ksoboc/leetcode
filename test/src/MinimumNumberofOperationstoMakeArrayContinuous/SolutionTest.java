package MinimumNumberofOperationstoMakeArrayContinuous;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums = {4, 2, 5, 3};
        var res = solution.minOperations(nums);
        assertEquals(0,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] nums = {1,2,3,5,6};
        var res = solution.minOperations(nums);
        assertEquals(1,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[] nums = {1,10,100,1000};
        var res = solution.minOperations(nums);
        assertEquals(3,res);
    }

    @Test
    void test4() {
        Solution solution=new Solution();
        int[] nums = {552310497};
        var res = solution.minOperations(nums);
        assertEquals(0,res);

    }
    @Test
    void test5() {
        Solution solution=new Solution();
        int[] nums = {4,5,8,8,9,9};
        var res = solution.minOperations(nums);
        assertEquals(2,res);

    }
    @Test
    void test6() {
        Solution solution=new Solution();
        int[] nums = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};
        var res = solution.minOperations(nums);
        assertEquals(10,res);

    }
    //

    @Test
    void test8() {
        Solution solution=new Solution();
        int[] nums = {41,33,29,33,35,26,47,24,18,28};
        var res = solution.minOperations(nums);
        assertEquals(5,res);

    }

}