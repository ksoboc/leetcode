package WordSearch;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    int cols;
    int rows;
    int wordLen;
    String word;
    char[][] board;
    Set<Integer> path;

    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;
        wordLen = word.length();
        this.word = word;
        this.board = board;
        path  = new HashSet<>();

        for (var r = 0; r < rows; ++r)
            for (var c = 0; c < cols; ++c)
                if (dfs(r, c, 0))
                    return true;

        return false;

    }

    private boolean dfs(int r, int c, int i) {
        if (i==wordLen)
            return true;

        var pos = r*cols+c;
        if (r<0 || r>=rows || c<0 || c>=cols || word.charAt(i) != board[r][c] || path.contains(pos) )
            return false;

        path.add(pos);

        var res =  dfs(r+1,c,i+1) ||
                dfs(r-1,c,i+1) ||
                dfs(r,c+1, i+1) ||
                dfs(r,c-1,i+1);
        path.remove(pos);
        return res;
    }
}
