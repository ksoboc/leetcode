package MinimumPathSum;

public class Solution {
    public int minPathSum(int[][] grid) {
        int nrRows = grid.length;
        int nrCols = grid[0].length;

        int[][] dp = new int[nrRows + 1][nrCols + 1];
        for (int r = 0; r <= nrRows; r++) {
            dp[r][nrCols] = Integer.MAX_VALUE;
        }
        for (int c = 0; c < nrCols - 1; c++) {
            dp[nrRows][c] = Integer.MAX_VALUE;
        }

        for (int r = nrRows - 1; r >= 0; r--) {
            for (int c = nrCols - 1; c >= 0; c--) {
                dp[r][c] = grid[r][c] + Math.min(dp[r + 1][c], dp[r][c + 1]);
            }
        }

        return dp[0][0];

    }
}
