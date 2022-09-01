package SurroundedRegions;

public class Solution {
    private char[][] board ;
    int nrRows;
    int nrCols;
    public void solve(char[][] board) {
        this.board=board;
        nrRows = board.length;
        nrCols = board[0].length;

        for (int r = 0; r < nrRows; r++) {
            for (int c:new int[]{0,nrCols-1}) {
                    dfs(r,c);
            }
        }
        for (int c = 1; c < nrCols-1; c++) {
            for (int r:new int[]{0,nrRows-1}) {
                dfs(r,c);
            }
        }

        for (int r = 1; r < nrRows-1; r++) {
            for (int c = 1; c < nrCols-1; c++) {
                if (board[r][c]=='O')
                    board[r][c] = 'X';

            }

        }

        for (int r = 0; r < nrRows; r++) {
            for (int c = 0; c < nrCols; c++) {
                if (board[r][c]=='T')
                    board[r][c] = 'O';

            }

        }

    }

    private void dfs(int r, int c) {
        if (r<0 || c<0 || r>=nrRows || c>=nrCols || board[r][c]!='O')
            return;
        board[r][c]='T';
        dfs(r+1,c);
        dfs(r-1,c);
        dfs(r,c+1);
        dfs(r,c-1);
    }
}
