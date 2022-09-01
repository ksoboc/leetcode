package WordBreak;

import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        var n = s.length();
        var dp = new boolean[n + 1];
        dp[n] = true;

        for (int i = s.length() - 1; i >= 0; --i) {
            for (var word : wordDict) {
                if (word.length() + i <= n && word.equals(s.substring(i, i + word.length())))
                    dp[i] = dp[i + word.length()];
                if (dp[i])
                    break;
            }

        }
        return dp[0];
    }
}
