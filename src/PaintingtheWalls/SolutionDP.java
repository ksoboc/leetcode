package PaintingtheWalls;

import java.util.Arrays;

public class SolutionDP {

    public int paintWalls(int[] cost, int[] time) {
        final int n = cost.length;
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            dp[n][i] = 2_000_000_000;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int remaining = 0; remaining <= n; remaining++) {
                int remIfTaken = Math.max(remaining - time[i] - 1, 0);
                dp[i][remaining] = Math.min(dp[i + 1][remaining], cost[i] + dp[i + 1][remIfTaken]);
            }

        }
        return  dp[0][n];
    }


}
