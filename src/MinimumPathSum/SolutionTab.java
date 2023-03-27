package MinimumPathSum;

public class SolutionTab {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];

        // initialize bottom-right cell
        dp[n - 1][m - 1] = grid[n - 1][m - 1];

        // initialize bottom row
        for (int c = m - 2; c >= 0; c--) {
            dp[n - 1][c] = grid[n - 1][c] + dp[n - 1][c + 1];
        }

        // initialize right column
        for (int r = n - 2; r >= 0; r--) {
            dp[r][m - 1] = grid[r][m - 1] + dp[r + 1][m - 1];
        }

        // fill rest of the cells
        for (int r = n - 2; r >= 0; r--) {
            for (int c = m - 2; c >= 0; c--) {
                dp[r][c] = grid[r][c] + Math.min(dp[r + 1][c], dp[r][c + 1]);
            }
        }

        return dp[0][0];
    }
}
