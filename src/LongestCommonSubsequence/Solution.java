package LongestCommonSubsequence;

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int nrRows = text1.length();
        int nrCols = text2.length();
        int[][] dp = new int[nrRows + 1][nrCols + 1];

        for (int r = nrRows - 1; r >= 0; --r) {
            var ch1 = text1.charAt(r);
            for (int c = nrCols - 1; c >= 0; --c) {
                var ch2 = text2.charAt(c);
                if (ch1 == ch2)
                    dp[r][c] = 1 + dp[r + 1][c + 1];
                else
                    dp[r][c] = Math.max(dp[r + 1][c], dp[r][c + 1]);
            }

        }

        return dp[0][0];
    }
}
