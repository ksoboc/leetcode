package InsertInterval;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] nInterval = {2, 5};

        var res = solution.insert(intervals, nInterval);
        System.out.println(Arrays.deepToString(res));
        assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, res);
    }

    @Test
    void test2() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] nInterval = {4, 8};
        var res = solution.insert(intervals, nInterval);
        System.out.println(Arrays.deepToString(res));
        assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}}, res);
    }

}