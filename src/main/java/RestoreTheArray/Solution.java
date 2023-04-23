package RestoreTheArray;

import java.util.Arrays;

public class Solution {
    private int[] dp;
    private final int mod = 1_000_000_007;

    public int numberOfArrays(String s, int k) {
        dp = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        return dfs(0, s, k);
    }

    private int dfs(int start, String s, int k) {
        if (start >= s.length())
            return 1;

        if (dp[start] != -1)
            return dp[start];

        if (s.charAt(start) == '0')
            return 0;

        int sum = 0;
        for (int i = start + 1; i <= s.length(); i++) {
            String sub = s.substring(start, i);
            long val = Long.parseLong(sub);
            if (val > k)
                break;
            sum += dfs(i, s, k);
            sum %= mod;
        }
        dp[start] = sum;
        return sum;
    }
}
