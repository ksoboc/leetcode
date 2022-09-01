package GameOfLife;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        int[][] board = {{1,1},{1,0}};
        solution.gameOfLife(board);

        System.out.println("board = " + Arrays.deepToString(board));

    }
    //
    @Test
    void test2() {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        solution.gameOfLife(board);

        System.out.println("board = " + Arrays.deepToString(board));

    }


}