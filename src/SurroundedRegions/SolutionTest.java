package SurroundedRegions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        solution.solve(board);

        printBoard(board);
    }
    @Test
    void test2() {
        char[][] board = {{'X'}};
        solution.solve(board);

        printBoard(board);
    }

    private void printBoard(char[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                System.out.print(board[r][c]);

            }
            System.out.println();
        }
    }

}