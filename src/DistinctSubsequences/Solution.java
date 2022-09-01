package DistinctSubsequences;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer, Integer> dp = new HashMap();

    public int numDistinct(String s, String t) {
        return dfs(s, t, 0, 0);
    }

    private int dfs(String s, String t, int i, int j) {
        if (j == t.length())
            return 1;
        if (i == s.length() || t.length() - j > s.length() - i) //
            return 0;

        int index = i * t.length() + j;
        if (dp.containsKey(index))
            return dp.get(index);

        int val = dfs(s, t, i + 1, j);
        if (s.charAt(i) == t.charAt(j))
            val += dfs(s, t, i + 1, j + 1);

        dp.put(index, val);
        return val;
    }

    public int numDistinctDP(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int r = 0; r < n + 1; r++) {
            dp[r][m] = 1;

        }

        for (int r = n - 1; r >= 0; --r) {
            for (int c = m - 1; c >= Math.max(0, m - n + r); --c) {
                if (s.charAt(r) == t.charAt(c)) {
                    dp[r][c] = dp[r + 1][c + 1] + dp[r + 1][c];
                } else
                    dp[r][c] = dp[r + 1][c];
            }

        }
        return dp[0][0];

    }
}
