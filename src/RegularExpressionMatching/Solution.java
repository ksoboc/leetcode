package RegularExpressionMatching;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private String pattern;
    private String input;
    private Boolean[][] dp;

    public boolean isMatch(String s, String p) {
        input = s;
        pattern = p;
        dp = new Boolean[s.length() + 1][p.length() + 1];
        return dfs(0, 0);

    }

    private boolean dfs(int i, int j) {
        if (j >= pattern.length() && i >= input.length())
            return true;
        if (dp[i][j] != null)
            return dp[i][j];
        if (j >= pattern.length()) {
            return false;
        }
        boolean match = i < input.length() && (input.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '.');
        if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
            dp[i][j] = dfs(i, j + 2) || (match && dfs(i + 1, j));
            return dp[i][j];
        }
        if (match) {
            dp[i][j] = dfs(i + 1, j + 1);
            return dp[i][j];
        }
        dp[i][j] = false;
        return false;
    }

    boolean isMatchBU(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[s.length()][p.length()] = true;

        for (int i = s.length(); i >= 0; --i) {
            for (int j = p.length() - 1; j >= 0; --j) {
                boolean match = i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
                if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                    dp[i][j] = dp[i][j + 2];
                    if (match)
                        dp[i][j] = dp[i+1][j] || dp[i][j];
                } else if (match)
                    dp[i][j] = dp[i + 1][j + 1];

            }

        }
        return dp[0][0];
    }
}
