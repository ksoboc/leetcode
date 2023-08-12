package UniquePathsII;

public class SolutionDP {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        final int nrows = obstacleGrid.length;
        final int nrcols = obstacleGrid[0].length;

        if (obstacleGrid[nrows-1][nrcols-1]==1 || obstacleGrid[0][0]==1)
            return 0;

        int[][] dp = new int[nrows + 1][nrcols + 1];
        dp[1][1] = 1;
        for (int r = 0; r < nrows; r++) {
            for (int c = 0; c < nrcols; c++) {
                if (r > 0 && obstacleGrid[r - 1][c] != 1)
                    dp[r+1][c+1] += dp[r][c+1];
                if (c > 0 && obstacleGrid[r][c - 1] != 1)
                    dp[r+1][c+1] += dp[r+1][c];
            }
        }

        return dp[nrows][nrcols];

    }
}
