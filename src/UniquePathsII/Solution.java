package UniquePathsII;

import java.util.Arrays;

public class Solution {
    private int[][] dp;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        final int nrows = obstacleGrid.length;
        final int nrcols = obstacleGrid[0].length;

        if (obstacleGrid[nrows - 1][nrcols - 1] == 1 || obstacleGrid[0][0] == 1)
            return 0;

        dp = new int[nrows + 1][nrcols + 1];
        for (var r : dp)
            Arrays.fill(r, -1);

        return helper(obstacleGrid, nrows - 1, nrcols - 1);

    }

    private int helper(int[][] obstacleGrid, int r, int c) {
        if (r < 0 || c < 0 || obstacleGrid[r][c] == 1)
            return 0;

        if (r == 0 && c == 0)
            return 1;


        if (dp[r][c] != -1)
            return dp[r][c];

        return dp[r][c] = helper(obstacleGrid, r - 1, c) + helper(obstacleGrid, r, c - 1);
    }
}
