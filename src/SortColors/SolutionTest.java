package SortColors;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        int[] nums = new int[]{2,0,2,1,1,0};
        solution.sortColorsBS(nums);

        System.out.println("nums = " + Arrays.toString(nums));
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    //
    @Test
    void test2() {
        int[] nums = new int[]{2,0,1};
        solution.sortColorsBS(nums);

        System.out.println("nums = " + Arrays.toString(nums));
        assertArrayEquals(new int[]{0, 1, 2}, nums);
    }

}