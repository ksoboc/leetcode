package MinimumNumberofDaystoEatNOranges;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer,Integer> dp = new HashMap<>(Map.of(0,0,1,1));
    public int minDays(int n) {
        return dfs(n);

    }

    private int dfs(int n) {
        if (dp.containsKey(n))
            return dp.get(n);

        var one = 1 + (n%2) + dfs(n/2);
        var two = 1 + (n%3) + dfs(n/3);
        var min = Math.min(one,two);
        dp.put(n,min);
        return min;
    }
}
