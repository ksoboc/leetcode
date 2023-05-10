package SpiralMatrixII;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.generateMatrix(3);
        int[][] expected = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        for (int r = 0; r < expected.length; r++) {
            assertArrayEquals(expected[r], res[r]);
        }
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.generateMatrix(1);
        int[][] expected = {{1}};
        for (int r = 0; r < expected.length; r++) {
            assertArrayEquals(expected[r], res[r]);
        }
    }

}