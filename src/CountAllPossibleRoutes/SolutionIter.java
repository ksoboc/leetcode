package CountAllPossibleRoutes;

import java.util.Arrays;

public class SolutionIter {
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        final int mod = 1_000_000_007;
        int[][] dp = new int[locations.length][fuel + 1];
        Arrays.fill(dp[finish], 1);

        for (int f = 0; f <= fuel; f++) {
            for (int i = 0; i < locations.length; i++) {
                for (int j = 0; j < locations.length; j++) {
                    if (i == j)
                        continue;
                    int fuelNeeded = Math.abs(locations[i] - locations[j]);
                    if (fuelNeeded <= f) {
                        dp[i][f] = (dp[i][f] + dp[j][f - fuelNeeded]) % mod;
                    }
                }
            }
        }
        return dp[start][fuel];
    }
}
