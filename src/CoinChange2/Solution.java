package CoinChange2;

public class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];

        for (int r = 0; r < coins.length; r++) {
            dp[r][0]=1;
        }

        for (int r = n-1; r >= 0 ; --r) {
            for (int c = 1; c <= amount ; ++c) {

                dp[r][c]=dp[r+1][c];
                if (c-coins[r]>=0) {
                    dp[r][c]+=dp[r][c-coins[r]];
                }

            }

        }
        return dp[0][amount];
    }
}
