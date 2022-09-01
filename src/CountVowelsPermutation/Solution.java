package CountVowelsPermutation;

public class Solution {
    public int countVowelPermutation(int n) {
        long[][] dp = new long[n][5];

        for (int i = 0; i < 5; i++) {
            dp[0][i] = 1;
        }

        int a = 0, e = 1, i = 2, o = 3, u = 4;
        long mod = 1_000_000_007L;
        for (int j = 1; j < n; j++) {
            dp[j][a] = dp[j - 1][e];
            dp[j][e] = (dp[j - 1][a] + dp[j - 1][i]) % mod;
            dp[j][i] = (dp[j - 1][a] + dp[j - 1][e] + dp[j - 1][o] + dp[j - 1][u]) % mod;
            dp[j][o] = (dp[j - 1][i] + dp[j - 1][u]) % mod;
            dp[j][u] = dp[j - 1][a];
        }

        long sum = 0;
        for (int j = 0; j < 5; j++) {
            sum = (sum + dp[n-1][j]) % mod;
        }
        return (int)sum;
    }
}
