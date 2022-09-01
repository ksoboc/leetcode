package ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[][] squares = new int[3][3];


        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c]=='.')
                    continue;
                var digit = board[r][c] - '1';
                var val = 1 << digit;

                if ((rows[r] & val)>0)
                    return false;
                if ((cols[c] & val)>0)
                    return false;
                if ((squares[r/3][c/3] & val)>0)
                    return false;
                rows[r] |= val;
                cols[c] |= val;
                squares[r/3][c/3] |= val;
            }

        }
        return true;
    }
    public boolean isValidSudokuSets(char[][] board) {
        Set<Character>[] rows = new Set[9];
        Set<Character>[] cols = new Set[9];
        Set<Character>[][] squares = new Set[3][3];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                squares[i][j] = new HashSet<>();
            }
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c]=='.')
                    continue;

                char ch = board[r][c];

                if (rows[r].contains(ch) )
                    return false;
                if (cols[c].contains(ch))
                    return false;
                if (squares[r/3][c/3].contains(ch))
                    return false;
                rows[r].add(ch);
                cols[c].add(ch);
                squares[r/3][c/3].add(ch);
            }

        }
        return true;
    }
}
