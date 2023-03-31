package NumberofWaysofCuttingaPizza;

import java.util.Arrays;

public class SolutionMemOptimized {
    public int ways(String[] pizza, int k) {
        int nrRows = pizza.length;
        int nrCols = pizza[0].length();
        int[][] apples = new int[nrRows + 1][nrCols + 1];
        int[][] prevDP = new int[nrRows][nrCols];

        for (int r = nrRows - 1; r >= 0; r--) {
            for (int c = nrCols - 1; c >= 0; c--) {
                apples[r][c] = (pizza[r].charAt(c) == 'A' ? 1 : 0) + apples[r + 1][c] + apples[r][c + 1] - apples[r + 1][c + 1];
                prevDP[r][c] = apples[r][c] > 0 ? 1 : 0;
            }
        }
        int mod = 1_000_000_007;

        for (int remain = 1; remain < k; remain++) {
            int[][] dp = new int[nrRows][nrCols];
            for (int r = 0; r < nrRows; r++) {
                for (int c = 0; c < nrCols; c++) {
                    for (int next_row = r + 1; next_row < nrRows; next_row++) {
                        if (apples[r][c] - apples[next_row][c] > 0) {
                            dp[r][c] += prevDP[next_row][c];
                            dp[r][c] %= mod;
                        }
                    }
                    for (int next_col = c + 1; next_col < nrCols; next_col++) {
                        if (apples[r][c] - apples[r][next_col] > 0) {
                            dp[r][c] += prevDP[r][next_col];
                            dp[r][c] %= mod;
                        }
                    }
                }

            }
            prevDP = Arrays.copyOf(dp,dp.length);
        }
        return prevDP[0][0];
    }
}
