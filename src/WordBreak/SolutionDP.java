package WordBreak;

import java.util.List;

public class SolutionDP {
    public boolean wordBreak(String s, List<String> wordDict) {
        var dp = new boolean[s.length() + 1];
        dp[s.length()] = true;

        for (int i = s.length() - 1; i >= 0; --i) {
            for (var word : wordDict) {
                if (word.length() + i <= s.length() && word.equals(s.substring(i, i + word.length())))
                    dp[i] = dp[i + word.length()];
                if (dp[i])
                    break;
            }

        }
        return dp[0];
    }
}
