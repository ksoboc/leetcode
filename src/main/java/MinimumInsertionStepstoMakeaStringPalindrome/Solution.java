package MinimumInsertionStepstoMakeaStringPalindrome;

import java.util.Arrays;

public class Solution {
    private int[][] dp;

    public int minInsertions(String s) {
        int n = s.length();
        dp = new int[n][n];
        for (var r : dp)
            Arrays.fill(r, -1);
        return minInsertions(s, 0, n - 1);
    }

    private int minInsertions(String s, int l, int r) {
        if (l >= r)
            return 0;
        if (dp[l][r] != -1) {
            return dp[l][r];
        }
        int res =
                s.charAt(l) != s.charAt(r) ? 1 + Math.min(minInsertions(s, l, r - 1), minInsertions(s, l + 1, r)) :
                        minInsertions(s, l + 1, r - 1);
        dp[l][r] = res;
        return res;
    }
}
