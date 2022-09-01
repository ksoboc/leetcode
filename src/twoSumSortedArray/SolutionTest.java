package twoSumSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        int[] numbers = {2,7,11,15};
        int target = 9;

        assertArrayEquals(new int[]{1,2}, solution.twoSum(numbers, target));
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        int[] numbers = {2,3,4};
        int target = 6;

        assertArrayEquals(new int[]{1,3}, solution.twoSum(numbers, target));
    }

}