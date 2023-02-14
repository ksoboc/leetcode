package PalindromePartitioning;

import java.util.ArrayList;
import java.util.List;

public class SolutionDP {
    List<String> part = new ArrayList<>();
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        dfs(s, 0, dp);
        return res;
    }

    private void dfs(String s, int i, boolean[][] dp) {
        if (i >= s.length()) {
            res.add(List.copyOf(part));
            return;
        }
        for (int j = i; j < s.length(); j++) {
            if (isPalindrome(s, i, j, dp)) {
                part.add(s.substring(i, j+1));
                dfs(s, j + 1, dp);
                part.remove(part.size() - 1);
            }

        }
    }

    private boolean isPalindrome(String s, int l, int r, boolean[][] dp) {

        if (s.charAt(l) == s.charAt(r) && ((r-l<=2) || dp[l+1][r-1])) {
            dp[l][r]=true;
            return true;
        }
        return false;
    }
}
