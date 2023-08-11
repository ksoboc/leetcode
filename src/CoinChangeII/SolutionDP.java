package CoinChangeII;


public class SolutionDP {

    public int change(int amount, int[] coins) {
        final int n = coins.length;
        final int[] dp = new int[amount + 1];

        dp[0]=1;

        for (int i = n-1; i >=0 ; i--) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i]<=j) {
                    dp[j] += dp[j-coins[i]];
                }
            }

        }
        return dp[amount];
    }

}
