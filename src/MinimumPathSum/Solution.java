package MinimumPathSum;

public class Solution {
    private int m, n;
    private Integer[][] dp;

    public int minPathSum(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        dp = new Integer[n][m];
        dp[n - 1][m - 1] = grid[n - 1][m - 1];
        return helper(0, 0, grid);
    }

    private int helper(int r, int c, int[][] grid) {
        if (r < 0 || r >= n)
            return Integer.MAX_VALUE;
        if (c < 0 || c >= m)
            return Integer.MAX_VALUE;
        if (dp[r][c] != null)
            return dp[r][c];

        dp[r][c] = grid[r][c] + Math.min(helper(r + 1, c, grid), helper(r, c + 1, grid));
        return dp[r][c];
    }
}
