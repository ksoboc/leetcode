package LargestNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void test() {
        int[] nums = {10,2};
         assertEquals("210",solution.largestNumber(nums));
    }

    @Test
    void test2() {
        int [] nums = {3,30,34,5,9};
        assertEquals("9534330",solution.largestNumber(nums));
    }

    @Test
    void test3() {
        int [] nums = {0,0,0,0};
        assertEquals("0",solution.largestNumber(nums));
    }

}