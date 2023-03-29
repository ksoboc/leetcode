package ReducingDishes;

import java.util.Arrays;

public class Solution {
    private int[][] dp;

    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        dp = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return maxSatisfaction(0, 1, satisfaction);
    }

    private int maxSatisfaction(int pos, int time, int[] satisfaction) {
        if (pos >= satisfaction.length)
            return 0;
        if (dp[pos][time] != -1) {
            return dp[pos][time];
        }
        int maxSum = Math.max(satisfaction[pos] * time + maxSatisfaction(pos + 1, time + 1, satisfaction), maxSatisfaction(pos + 1, time, satisfaction));
        dp[pos][time] = maxSum;
        return maxSum;
    }
}
