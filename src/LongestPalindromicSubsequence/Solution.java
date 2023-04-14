package LongestPalindromicSubsequence;

import java.util.Arrays;

public class Solution {
    int[][] dp;

    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return longestPalindromeSubseq(s, 0, n - 1);
    }

    private int longestPalindromeSubseq(String s, int start, int end) {
        if (end < start)
            return 0;

        if (start==end)
            return 1;

        if (dp[start][end] != -1)
            return dp[start][end];

        int res;
        if (s.charAt(start) == s.charAt(end)) {
            res = 2 + longestPalindromeSubseq(s, start + 1, end - 1);
        } else {
            res = Math.max(longestPalindromeSubseq(s, start + 1, end), longestPalindromeSubseq(s, start, end - 1));
        }
        dp[start][end] = res;
        return res;
    }
}
