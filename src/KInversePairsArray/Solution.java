package KInversePairsArray;

public class Solution {
    Integer[][] dp;

    public int kInversePairs(int n, int k) {
        dp = new Integer[n + 1][k + 1];

        return calckInversePairs(n, k);

    }

    private int calckInversePairs(int n, int k) {
        if (k > (n - 1) * n / 2)
            return 0;
        if (k == 0 || k == (n - 1) * n / 2)
            return 1;

        if (dp[n][k] != null)
            return dp[n][k];

        int inv = 0;
        for (int i = 0; i <= Math.min(n - 1, k); i++) {
            inv += calckInversePairs(n - 1, k - i) % 1_000_000_007;

        }
        dp[n][k] = inv;
        return inv;

    }


}
