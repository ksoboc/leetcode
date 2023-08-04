package WordBreak;

import java.util.List;

public class Solution {
    private Boolean[] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        dp=new Boolean[s.length()];
        return wordBreak(s, wordDict, 0);
    }

    private boolean wordBreak(String s, List<String> wordDict, int i) {

        if (i>=s.length())
            return true;

        if (dp[i]!=null)
            return dp[i];

        for (var word:wordDict) {
            if (s.substring(i).startsWith(word) &&
                wordBreak(s,wordDict,i+word.length())) {
                    dp[i]=true;
                    return true;
            }
        }
        dp[i]=false;
        return dp[i];
    }
}
