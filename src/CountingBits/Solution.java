package CountingBits;

public class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        var offset = 1;

        for (int i = 1; i < n + 1; i++) {
            if (i == offset << 1) {
                offset = i;
            }
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }
    public int[] countBits2(int n) {
        int dp[] = new int[n+1];
        for (int i = 1; i < n + 1; i++) {
            dp[i] = dp[i>>1] + (i&1);
        }
        return dp;
    }

}
