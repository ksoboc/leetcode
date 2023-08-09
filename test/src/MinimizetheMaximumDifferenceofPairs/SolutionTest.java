package MinimizetheMaximumDifferenceofPairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums = {10,1,2,7,1,3};
        var res=solution.minimizeMax(nums,2);
        System.out.println("res = " + res);
        assertEquals(1,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] nums = {4,2,1,2};
        var res=solution.minimizeMax(nums,1);
        System.out.println("res = " + res);
        assertEquals(0,res);
    }

    @Test
    void test3() {
        Solution solution=new Solution();
        int[] nums = {3,4,2,3,2,1,2};
        var res=solution.minimizeMax(nums,3);
        System.out.println("res = " + res);
        assertEquals(1,res);
    }
}