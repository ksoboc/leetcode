package ExtraCharactersinaString;

import java.util.Arrays;

public class SolutionDP {


    public int minExtraChar(String s, String[] dictionary) {
        final int n = s.length();
        int[] dp = new int[n + 1];
        dp[n] = 0;

        for (int i = n - 1; i >= 0; --i) {
            dp[i] = dp[i + 1] + 1;
            var rest = s.substring(i);
            for (var word : dictionary) {
                if (rest.startsWith(word)) {
                    dp[i] = Math.min(dp[i], dp[i + word.length()]);
                }
            }

        }

        return dp[0];
    }

}
