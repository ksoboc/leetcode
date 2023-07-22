package KnightProbabilityinChessboard;

public class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        double[][] board = new double[n][n];

        board[row][column]=1.0;
        int[][] diffs = {{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};
        for (int move = 0; move < k; move++) {
            double[][] nboard = new double[n][n];
            for (int r=0;r<n;r++) {
                for (int c = 0; c < n; c++) {
                    for (var diff :diffs) {
                        int nr=r+diff[0];
                        int nc=c+diff[1];

                        if (nr>=0 && nr<n && nc>=0 && nc<n) {
                            nboard[nr][nc] += board[r][c] / 8.0;
                        }
                     }
                 }
            }
            board=nboard;
        }

        double prob=0.0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                prob+=board[r][c];

            }

        }

        return prob;

    }
}
