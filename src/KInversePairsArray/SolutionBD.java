package KInversePairsArray;

public class SolutionBD {
    public int kInversePairs(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= k; j++) {
                int inv = 0;
                for (int l = 0; l <= Math.min(i * (i - 1) / 2, j); l++) {
                    inv = (inv + dp[i - 1][j - l]) % 1_000_000_007;
                }
                dp[i][j] = inv;
            }

        }
        return dp[n][k];
    }
}
