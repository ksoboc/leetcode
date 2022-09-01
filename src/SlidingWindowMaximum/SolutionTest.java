package SlidingWindowMaximum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        int[] nums = {1,3,-1,-3,5,3,6,7};
        var k = 3;

        var res = solution.maxSlidingWindow(nums, k);
        System.out.println("solution.maxSlidingWindow(nums,k) = " + Arrays.toString(res));
    }

    @Test
    void test2() {
        Solution solution = new Solution();

        int[] nums = {1};
        var k = 1;

        var res = solution.maxSlidingWindow(nums, k);
        System.out.println("solution.maxSlidingWindow(nums,k) = " + Arrays.toString(res));
    }

}