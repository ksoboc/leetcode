package ConcatenatedWords;

import java.util.*;

public class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        final Set<String> wordsSet = new HashSet<>(Arrays.asList(words));
        final List<String> answer = new ArrayList<>();

        for (var word:words) {
            final int n=word.length();
            boolean[] dp = new boolean[n+1];
            dp[0]=true;
            for (int i = 0; i < n+1; i++) {
                for (int j = (i==n) ? 1 : 0; j < i && !dp[i]; j++) {
                    dp[i] = wordsSet.contains(word.substring(j,i)) && dp[j];
                }
            }
            if (dp[n])
                answer.add(word);
        }
        return answer;
    }
}
