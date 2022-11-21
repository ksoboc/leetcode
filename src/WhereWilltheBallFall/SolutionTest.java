package WhereWilltheBallFall;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution = new Solution();

        int[][] grid = {{1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1}, {-1, -1, -1, -1, -1}};
        var res = solution.findBall(grid);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        assertArrayEquals(new int[]{1, -1, -1, -1, -1}, res);
    }

    @Test
    void test2() {
        Solution solution = new Solution();

        int[][] grid = {{-1}};
        var res = solution.findBall(grid);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        assertArrayEquals(new int[]{-1}, res);
    }

    @Test
    void test3() {
        Solution solution = new Solution();

        int[][] grid = {{1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}, {1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}};
        var res = solution.findBall(grid);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, -1}, res);
    }
}