package LongestPalindromicSubsequence;


public class SolutionDP {

    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int r = 0; r < n; r++) {
            dp[r][r] = 1;
        }

        for (int start = n - 1; start >= 0; start--) {
            for (int end = start + 1; end < n; end++) {
                if (s.charAt(start) == s.charAt(end)) {
                    dp[start][end] = 2 + dp[start + 1][end - 1];
                } else {
                    dp[start][end] = Math.max(dp[start + 1][end], dp[start][end - 1]);
                }
            }

        }
        return dp[0][n - 1];
    }

}
