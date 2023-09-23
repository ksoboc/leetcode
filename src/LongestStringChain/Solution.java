package LongestStringChain;

import java.util.*;

public class Solution {
    public int longestStrChain(String[] words) {
        Map<String,Integer> dp=new HashMap<>();
        List<String>[] wordsOfLength = new List[17];
        for (int i = 0; i < 17; i++) {
            wordsOfLength[i] = new ArrayList<>();
        }

        int maxLen=0;
        for (var word:words) {
            wordsOfLength[word.length()].add(word);
            maxLen=Math.max(maxLen,word.length());
        }

        int longestChain = 1;
        for (int i = maxLen; i > 0 ; --i) {
            if (wordsOfLength[i-1].isEmpty())
                continue;
            for (var word:wordsOfLength[i]) {
                int wLen = dp.getOrDefault(word,1);
                for (int j = 0; j < i; j++) {
                    String shorterWord = word.substring(0,j) + word.substring(j+1);

                    if (wordsOfLength[i-1].contains(shorterWord) && dp.getOrDefault(shorterWord,1)<=wLen) {
                        dp.put(shorterWord,wLen+1);
                        longestChain = Math.max(longestChain,wLen+1);
                    }
                }
            }
        }
        return longestChain;
    }
}
