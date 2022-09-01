package BestTimetoBuyandSellStockwithCooldown;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    private int[] prices;
    private Map<Pair,Integer> dp = new HashMap<>();


    public int maxProfitDP(int[] prices) {
        int[][] cache = new int[prices.length+2][2];

        for (int i = prices.length-1; i >= 0 ; i--) {
            cache[i][0] = Math.max(cache[i+1][0], prices[i] + cache[i+2][1]);
            cache[i][1] = Math.max(cache[i+1][1], cache[i+1][0] - prices[i]);
        }

        return cache[0][1];
    }

    public int maxProfit(int[] prices) {
        this.prices=prices;

        return dfs(0,true);
    }

    private int dfs(int i, boolean buying) {
        if (i>=prices.length)
            return 0;

        Pair pair = new Pair(i,buying);
        if (dp.containsKey(pair))
            return dp.get(pair);

        int cooldown = dfs(i+1,buying);
        int val = 0;
        if (buying) {
            int buy = dfs(i+1, !buying) - prices[i];
            val = Math.max(cooldown,buy);
        } else {
            int sell = dfs(i+2, !buying) + prices[i];
            val = Math.max(cooldown,sell);
        }

        dp.put(pair,val);
        return val;
    }

    private class Pair {
        int index;
        boolean state;

        public Pair(int index, boolean state) {
            this.index = index;
            this.state = state;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return index == pair.index && state == pair.state;
        }

        @Override
        public int hashCode() {
            return Objects.hash(index, state);
        }
    }
}
