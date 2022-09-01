package GameOfLife;

public class Solution {
    private int[][] board;
    private int numCols;
    private int numRows;

    public void gameOfLife(int[][] board) {
        // old new
        // 0   0     0  00
        // 1   0     1  01
        // 0   1     2  10
        // 1   1     3  11
        numRows=board.length;
        numCols=board[0].length;
        this.board=board;

        for (var r=0;r<numRows;++r) {
            for (int c = 0; c < numCols; c++) {
                int nei = neighbours(r,c);
                if (board[r][c]==1) {

                    if (nei>=2 && nei<=3)
                        board[r][c] = 3;
                    else
                        board[r][c] = 1;
                } else {
                    if (nei==3)
                        board[r][c] = 2;
                }
            }
        }

        for (var r=0;r<numRows;++r) {
            for (int c = 0; c < numCols; c++) {
                board[r][c] = board[r][c] >= 2?1:0;
            }
        }

    }

    private int neighbours(int r, int c) {
        int nei = 0;
        for (int nr = r-1; nr <= r+1; nr++) {
            for (int nc = c-1; nc <= c+1; nc++) {
                if (nr<0 || nr>numRows-1 || nc<0 || nc>numCols-1 || nr==r && nc==c)
                    continue;
                if ((board[nr][nc] & 1) > 0)
                    nei+=1;
            }

        }
        return nei;
    }
}
