package BattleshipInaBoard;

public class Solution {
    public int countBattleships(char[][] board) {
        int numOfBattleships = 0;

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == 'X') {
                    if (r > 0 && board[r - 1][c] == 'X')
                        continue;
                    if (c > 0 && board[r][c - 1] == 'X')
                        continue;
                    ++numOfBattleships;
                }
           }
        }
        return numOfBattleships;
    }
}
