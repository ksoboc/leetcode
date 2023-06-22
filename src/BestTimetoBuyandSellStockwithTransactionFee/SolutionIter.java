package BestTimetoBuyandSellStockwithTransactionFee;

import java.util.Arrays;

public class SolutionIter {
    private int[][] dp;

    public int maxProfit(int[] prices, int fee) {
        int hold = -prices[0];
        int free=0;
        for (int i = 0; i < prices.length; i++) {
            hold = Math.max(hold, free - prices[i]);
            free = Math.max(free, hold + prices[i] - fee);
        }
        return Math.max(free,hold);
    }


}
