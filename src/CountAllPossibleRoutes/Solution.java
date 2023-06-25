package CountAllPossibleRoutes;

import java.util.Arrays;

public class Solution {
    private int[][] dp;
    private int mod = 1_000_000_007;

    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        dp = new int[locations.length][fuel + 1];
        for (var r : dp)
            Arrays.fill(r, -1);

        return helper(locations, start, finish, fuel);
    }

    public int helper(int[] locations, int start, int finish, int fuel) {
        if (fuel < 0)
            return 0;
        if (dp[start][fuel] != -1)
            return dp[start][fuel];
        int count = start == finish ? 1 : 0;
        for (int i = 0; i < locations.length; ++i) {
            if (i == start) {

                continue;
            }
            int fuelNeeded = Math.abs(locations[i] - locations[start]);
            if (fuelNeeded <= fuel) {

                count += helper(locations, i, finish, fuel - fuelNeeded);
                count %= mod;
            }
        }
        count %= mod;
        dp[start][fuel] = count;
        return count;
    }
}
