package MinimumCosttoCutaStick;

import java.util.Arrays;

public class Solution {
    private int[][] dp;

    public int minCost(int n, int[] cuts) {
        final int nrCuts = cuts.length;
        int[] coords = new int[nrCuts + 2];
        Arrays.sort(cuts);
        coords[0] = 0;
        System.arraycopy(cuts, 0, coords, 1, nrCuts);
        coords[nrCuts + 1] = n;
        dp = new int[nrCuts + 2][nrCuts + 2];

        return f(coords, 0, nrCuts + 1);
    }

    private int f(int[] coords, int i, int j) {

        if (j <= i + 1)
            return 0;

        if (dp[i][j] != 0)
            return dp[i][j];

        int min = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; ++k) {
            min = Math.min(min, f(coords, i, k) + f(coords, k, j));
        }
        var res = coords[j] - coords[i] + min;
        dp[i][j] = res;
        return res;
    }
}
