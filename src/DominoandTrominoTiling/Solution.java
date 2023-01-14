package DominoandTrominoTiling;

public class Solution {
    public int numTilings(int n) {
        final long MOD = 1_000_000_007L;
        if (n < 3)
            return n;
        long[][] dp = new long[n + 1][3];
        dp[0][0] = dp[1][0] = 1;
        dp[1][1] = dp[1][2] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 2][0] + dp[i - 2][1] + dp[i - 2][2]) % MOD;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
        }
        return (int) dp[n][0];

    }
}
