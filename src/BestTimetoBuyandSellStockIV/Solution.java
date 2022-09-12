package BestTimetoBuyandSellStockIV;

public class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0)
            return 0;

        int[][] profits = new int[n][k + 1];

        for (int t = 1; t < k + 1; t++) {
            int maxSoFar = -prices[0];
            for (int d = 1; d < n; d++) {
                maxSoFar = Math.max(maxSoFar, profits[d - 1][t - 1] - prices[d - 1]);
                profits[d][t] = Math.max(profits[d - 1][t], maxSoFar + prices[d]);
            }

        }
        return profits[n - 1][k];
    }

    public int maxProfitRS(int k, int[] prices) {
        int n = prices.length;

        if (n == 0)
            return 0;

        int[] evenProfits = new int[n];
        int[] oddProfits = new int[n];
        int[] currentProfits = evenProfits;
        int[] prevProfits;

        for (int t = 1; t < k + 1; t++) {
            int maxSoFar = -prices[0];
            if (t % 2 == 1) {
                currentProfits = oddProfits;
                prevProfits = evenProfits;
            } else {
                currentProfits = evenProfits;
                prevProfits = oddProfits;
            }
            for (int d = 1; d < n; d++) {
                maxSoFar = Math.max(maxSoFar, prevProfits[d - 1] - prices[d - 1]);
                currentProfits[d] = Math.max(currentProfits[d - 1], maxSoFar + prices[d]);
            }

        }
        return currentProfits[n - 1];
    }

}
