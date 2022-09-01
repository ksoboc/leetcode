package DeleteOperationforTwoStrings;

public class Solution {
    private int n;
    private int m;
    private int[][] dp;

    public int minDistance(String word1, String word2) {
        n = word1.length();
        m = word2.length();
        dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;

            }

        }
        return minDistance(word1, word2, 0, 0);


    }


    private int minDistance(String word1, String word2, int i, int j) {
        if (i == n)
            return m - j;
        if (j == m)
            return n - i;
//        if (word1.substring(i).equals(word2.substring(j)))
//            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (word1.charAt(i) != word2.charAt(j)) {
            dp[i][j] = 1 + Math.min(minDistance(word1, word2, i + 1, j), minDistance(word1, word2, i, j + 1));
        } else {
            dp[i][j] = minDistance(word1, word2, i + 1, j + 1);
        }
        return dp[i][j];
    }

    public int minDistanceDP(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n + 1][m + 1];
        dp[n][m] = 0;
        for (int i = 0; i < n; ++i) {
            dp[i][m] = n - i;
        }
        for (int j = 0; j < m; ++j) {
            dp[n][j] = m - j;
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (word1.charAt(i) != word2.charAt(j)) {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j + 1]);
                } else {
                    dp[i][j] = dp[i + 1][j + 1];
                }

            }

        }
        return dp[0][0];
    }
}
