package SoupServings;

import java.util.Arrays;

public class Solution {
    private double[][] dp;

    public double soupServings(int n) {
        int nrServings = (int) Math.ceil((double) n / 25);
        dp = new double[nrServings + 1][nrServings + 1];
        for (var row : dp)
            Arrays.fill(row, -1.0);

        dp[0][0] = 0.5;

        for (int k = 1; k <= nrServings; ++k) {
            dp[0][k] = 1.0;
            dp[k][0] = 0.0;
            for (int j = 1; j <= k; j++) {
                dp[j][k] = soupServings(j,k);
                dp[k][j] = soupServings(k,j);
            }

            if (dp[k][k] > 1.0 - 1e-5)
                return dp[k][k];
        }

        return dp[nrServings][nrServings];
    }

    private double soupServings(int a, int b) {
        a = Math.max(0, a);
        b = Math.max(0, b);
        if (a == 0) {
            if (b == 0) {
                return 0.5;
            }
            return 1.0;
        }
        if (b == 0)
            return 0;

        if (dp[a][b] != -1)
            return dp[a][b];

        double res;
        res = 0.25 * soupServings(a - 4, b);
        res += 0.25 * soupServings(a - 3, b - 1);
        res += 0.25 * soupServings(a - 2, b - 2);
        res += 0.25 * soupServings(a - 1, b - 3);
        dp[a][b] = res;
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        for (int i = 200; i < 5000; ++i) {
            var res = solution.soupServings(i);
            System.out.printf("solution.soupServings(%d) = %f\n", i, res);

        }
    }
}
