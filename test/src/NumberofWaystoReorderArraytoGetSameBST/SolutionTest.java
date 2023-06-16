package NumberofWaystoReorderArraytoGetSameBST;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums = {2,1,3};
        var res=solution.numOfWays(nums);
//        System.out.println("res = " + res);
        assertEquals(1, res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] nums = {3,4,5,1,2};
        var res=solution.numOfWays(nums);
//        System.out.println("res = " + res);
        assertEquals(5, res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[] nums = {10,23,12,18,4,29,2,8,41,31,25,21,14,35,26,5,19,43,22,37,9,20,44,28,1,39,30,38,36,6,13,16,27,17,34,7,15,3,11,24,42,33,40,32};
        var res=solution.numOfWays(nums);
//        System.out.println("res = " + res);
        assertEquals(182440977, res);
    }

}