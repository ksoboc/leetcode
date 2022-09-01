package MergeSortedArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        solution.merge(nums1, 3, new int[]{2, 5, 6}, 3);
        System.out.println("nums1 = " + Arrays.toString(nums1));
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void test2() {
        int[] nums1 = {1};
        solution.merge(nums1, 1, new int[]{}, 0);
        assertArrayEquals(new int[]{1}, nums1);
    }

}