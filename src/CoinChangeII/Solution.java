package CoinChangeII;

import java.util.Arrays;

public class Solution {
    private int[][] dp;

    public int change(int amount, int[] coins) {
        dp = new int[amount + 1][coins.length];
        for (var r : dp)
            Arrays.fill(r, -1);
        return helper(amount, coins, 0);
    }

    private int helper(int amount, int[] coins, int i) {
        if (amount == 0)
            return 1;
        if (i >= coins.length || amount < 0)
            return 0;

        if (dp[amount][i] != -1)
            return dp[amount][i];

        int res =
            coins[i]>amount ? helper(amount,coins, i+1) :
                helper(amount,coins,i+1) + helper(amount-coins[i],coins,i);
        dp[amount][i] = res;
        return res;
    }
}
