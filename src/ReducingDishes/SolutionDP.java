package ReducingDishes;

import java.util.Arrays;

public class SolutionDP {


    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int[][] dp = new int[n + 1][n + 1];
        for (int t = n - 1; t >= 0; --t) {
            for (int p = n - 1; p >= 0; --p) {
                dp[p][t] = Math.max(dp[p + 1][t], satisfaction[p] * (t + 1) + dp[p + 1][t + 1]);
            }
        }
        return dp[0][0];
    }

}
