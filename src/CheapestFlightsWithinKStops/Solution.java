package CheapestFlightsWithinKStops;

import java.util.Arrays;

public class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] prices = new int[n];
        int[] tempPrices ;

        Arrays.fill(prices,Integer.MAX_VALUE);
        prices[src] = 0;

        for (var step = 0; step < k + 1; ++step) {
            tempPrices = Arrays.copyOf(prices, prices.length);
            for (var edge : flights) {
                var from = edge[0];
                var to = edge[1];
                var price = edge[2];
                if (prices[from] == Integer.MAX_VALUE)
                    continue;
                if (prices[from] + price < tempPrices[to]) {
                    tempPrices[to] = prices[from] + price;
                }
            }
            prices = tempPrices;
        }

        return prices[dst] == Integer.MAX_VALUE ? -1 : prices[dst];
    }
}
