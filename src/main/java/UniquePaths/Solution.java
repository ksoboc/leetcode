package UniquePaths;

public class Solution {
    private int nrRows;
    private int nrCols;
    private int[][] dp;

    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        nrRows=m;
        nrCols=n;
        return dfs(0,0);
    }

    private int dfs(int r, int c) {
        if (r>=nrRows-1)
            return 1;
        if (c>=nrCols-1)
            return 1;

        if (dp[r][c]!=0)
            return dp[r][c];

        int res = dfs(r+1,c) + dfs(r,c+1);
        dp[r][c] = res;

        return res;

    }

    public int uniquePathsDP(int m, int n) {
        int[][] dp = new int[m][n];

        for (int r = 0; r < m; ++r) {
            dp[r][n-1] = 1;
        }

        for (int c = 0; c < n - 1; ++c) {
            dp[m-1][c]=1;
        }

        for (int r = m-2; r >= 0; --r) {
            for (int c = n-2; c >= 0; --c) {
                dp[r][c] = dp[r+1][c] + dp[r][c+1];
            }
        }
        return dp[0][0];
    }
}
