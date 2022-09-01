package MinimumCostForTickets;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length + 1];
        int[] nrDays = {1, 7, 30};

        for (int i = days.length - 1; i >= 0; i--) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < costs.length; j++) {
                int d = nrDays[j];

                int k = i + 1;
                while (k < days.length && days[k] < days[i] + d)
                    ++k;

                dp[i] = Math.min(dp[i], costs[j] + dp[k]);

            }

        }
        return dp[0];

    }

    Map<Integer, Integer> dp = new HashMap<>();
    int[] nrDays = {1, 7, 30};
    int[] days;
    int[] costs;

    public int mincostTicketsRecursive(int[] days, int[] costs) {

        this.days = days;
        this.costs = costs;

        return dfs(0);
    }

    private int dfs(int i) {
        if (i >= days.length)
            return 0;
        if (dp.containsKey(i))
            return dp.get(i);

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < costs.length; j++) {
            int d = nrDays[j];

            int k = i + 1;
            while (k < days.length && days[k] < days[i] + d)
                ++k;

            min = Math.min(min, costs[j] + dfs(k));
        }
        dp.put(i, min);

        return min;
    }
}
