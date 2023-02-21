package WordSearch;

public class Solution {
    private int cols;
    private int rows;
    private int wordLen;
    private String word;
    private char[][] board;
    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;
        wordLen = word.length();
        this.word = word;
        this.board = board;
        visited=new boolean[rows][cols];

        for (var r = 0; r < rows; ++r)
            for (var c = 0; c < cols; ++c)
                if (dfs(r, c, 0))
                    return true;

        return false;

    }

    private boolean dfs(int r, int c, int i) {
        if (i==wordLen)
            return true;

        if (r<0 || r>=rows || c<0 || c>=cols || word.charAt(i) != board[r][c] || visited[r][c]  )
            return false;


        visited[r][c]=true;

        var res =  dfs(r+1,c,i+1) ||
                dfs(r-1,c,i+1) ||
                dfs(r,c+1, i+1) ||
                dfs(r,c-1,i+1);

        visited[r][c]=false;
        return res;
    }
}
