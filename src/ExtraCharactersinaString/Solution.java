package ExtraCharactersinaString;

import java.util.Arrays;

public class Solution {
    private int[] dp;

    public int minExtraChar(String s, String[] dictionary) {
        dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return minExtraChar(s, dictionary, 0);
    }

    private int minExtraChar(String s, String[] dictionary, int i) {
        if (i >= s.length())
            return 0;
        if (dp[i] != -1)
            return dp[i];
        int min = 1 + minExtraChar(s, dictionary, i + 1);
        String rest = s.substring(i);
        for (var word : dictionary) {
            if (rest.startsWith(word)) {
                min = Math.min(min, minExtraChar(s, dictionary, i + word.length()));
            }
        }
        dp[i] = min;
        return min;
    }
}
