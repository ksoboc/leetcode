package StoneGame;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private int[] piles;
    private Map<Pair, Integer> dp = new HashMap<>();

    private class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public boolean stoneGame(int[] piles) {
        this.piles = piles;
        int sum = 0;
        for (int i = 0; i < piles.length; i++) {
            sum += piles[i];

        }
        int aliceScore = dfs(0, piles.length - 1);
        return aliceScore > (sum - aliceScore);
    }

    private int dfs(int l, int r) {
        if (l > r)
            return 0;
        var pair = new Pair(l, r);
        if (dp.containsKey(pair))
            return dp.get(pair);
        boolean even = (r - l) % 2 == 0;
        int left;
        int right;
        if (even) {
            left = piles[l];
            right = piles[r];
        } else {
            left = 0;
            right = 0;
        }
        var res = Math.max(left + dfs(l + 1, r), right + dfs(l, r - 1));
        dp.put(pair, res);
        return res;
    }
}
