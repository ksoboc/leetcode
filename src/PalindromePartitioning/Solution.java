package PalindromePartitioning;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> part = new ArrayList<>();
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        dfs(s, 0);
        return res;
    }

    private void dfs(String s, int i) {
        if (i >= s.length()) {
            res.add(List.copyOf(part));
            return;
        }
        for (int j = i; j < s.length(); j++) {
            if (isPalindrome(s, i, j)) {
                part.add(s.substring(i, j+1));
                dfs(s, j + 1);
                part.remove(part.size() - 1);
            }

        }
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            ++l;
            --r;
        }
        return true;
    }
}
