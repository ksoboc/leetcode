package StoneGameIII;

public class SolutionDP {
    public String stoneGameIII(int[] stoneValue) {
        final int n = stoneValue.length;
        int[] dp = new int[n+1];

        for (int i = n-1; i >= 0; --i) {
            dp[i] = stoneValue[i] - dp[i+1];
            if (i+2<=n) {
                dp[i] = Math.max(dp[i], stoneValue[i] + stoneValue[i+1] - dp[i+2]);
            }
            if (i+3<=n) {
                dp[i] = Math.max(dp[i], stoneValue[i] + stoneValue[i+1] + stoneValue[i+2] - dp[i+3]);
            }

        }
        return dp[0] == 0 ? "Tie" :
                dp[0] > 0 ? "Alice" :
                        "Bob";

    }

}
