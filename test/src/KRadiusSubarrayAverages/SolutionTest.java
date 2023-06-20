package KRadiusSubarrayAverages;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums = {7,4,3,9,1,8,5,2,6};

        assertArrayEquals(new int[]{-1,-1,-1,5,4,4,-1,-1,-1}, solution.getAverages(nums,3));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] nums = {100000};

        assertArrayEquals(new int[]{100000}, solution.getAverages(nums,0));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[] nums = {8};

        assertArrayEquals(new int[]{-1}, solution.getAverages(nums,100000));
    }

}