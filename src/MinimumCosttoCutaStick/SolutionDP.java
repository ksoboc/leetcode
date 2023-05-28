package MinimumCosttoCutaStick;

import java.util.Arrays;

public class SolutionDP {
    public int minCost(int n, int[] cuts) {
        final int nrCuts = cuts.length;
        int[] coords = new int[nrCuts + 2];
        Arrays.sort(cuts);
        coords[0] = 0;
        System.arraycopy(cuts, 0, coords, 1, nrCuts);
        coords[nrCuts + 1] = n;
        int[][] dp = new int[nrCuts + 2][nrCuts + 2];

        // Fill the table diagonally
        for (int len = 2; len <= nrCuts + 1; len++) {
            for (int i = 0; i <= nrCuts + 1 - len; i++) {
                int j = i + len;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
                }
                dp[i][j] += coords[j] - coords[i];
            }
        }

        return dp[0][nrCuts + 1];
    }
}
