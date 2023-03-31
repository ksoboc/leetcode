package NumberofWaysofCuttingaPizza;

public class Solution {
    public int ways(String[] pizza, int k) {
        int nrRows = pizza.length;
        int nrCols = pizza[0].length();
        int[][] apples = new int[nrRows + 1][nrCols + 1];
        int[][][] dp = new int[k][nrRows][nrCols];
        for (int r = nrRows - 1; r >= 0; r--) {
            for (int c = nrCols - 1; c >= 0; c--) {
                apples[r][c] = (pizza[r].charAt(c) == 'A' ? 1 : 0) + apples[r + 1][c] + apples[r][c + 1] - apples[r + 1][c + 1];
                dp[0][r][c] = apples[r][c] > 0 ? 1 : 0;
            }
        }
        int mod = 1_000_000_007;
        for (int remain = 1; remain < k; remain++) {
            for (int r = 0; r < nrRows; r++) {
                for (int c = 0; c < nrCols; c++) {
                    for (int next_row = r + 1; next_row < nrRows; next_row++) {
                        if (apples[r][c] - apples[next_row][c] > 0) {
                            dp[remain][r][c] += dp[remain - 1][next_row][c];
                            dp[remain][r][c] %= mod;
                        }
                    }
                    for (int next_col = c + 1; next_col < nrCols; next_col++) {
                        if (apples[r][c] - apples[r][next_col] > 0) {
                            dp[remain][r][c] += dp[remain - 1][r][next_col];
                            dp[remain][r][c] %= mod;
                        }
                    }
                }

            }

        }
        return dp[k - 1][0][0];
    }
}
