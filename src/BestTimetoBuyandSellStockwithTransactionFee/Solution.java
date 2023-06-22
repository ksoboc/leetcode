package BestTimetoBuyandSellStockwithTransactionFee;

import java.util.Arrays;

public class Solution {
    private int[][] dp;

    public int maxProfit(int[] prices, int fee) {
        dp = new int[prices.length][2];
        for (var row : dp) {
            Arrays.fill(row, -1);
        }
        return maxProfit(prices, fee, 0, 0);
    }

    private int maxProfit(int[] prices, int fee, int i, int hasAction) {
        if (i >= prices.length)
            return 0;

        if (dp[i][hasAction] != -1)
            return dp[i][hasAction];
        int res;
        if (hasAction == 1) {
            res = Math.max(prices[i] - fee + maxProfit(prices, fee, i + 1, 0), maxProfit(prices, fee, i + 1, 1));
        } else {
            res = Math.max(maxProfit(prices, fee, i + 1, 0), maxProfit(prices, fee, i + 1, 1) - prices[i]);
        }
        dp[i][hasAction] = res;
        return res;
    }
}
