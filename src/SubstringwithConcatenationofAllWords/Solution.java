package SubstringwithConcatenationofAllWords;

import java.util.*;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (var word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        var wordLen = words[0].length();
        var windowLen = wordLen * words.length;

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= s.length() - windowLen; i++) {
            if (matches(wordCount, s.substring(i, i + windowLen), words, wordLen)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean matches(Map<String, Integer> wordsCount, String s, String[] words, int wordLen) {
        Map<String,Integer> substrWordsCount = new HashMap<>();
        for (int i = 0; i < s.length(); i += wordLen) {
            var word = s.substring(i, i + wordLen);
            substrWordsCount.put(word, substrWordsCount.getOrDefault(word,0) + 1);
            if (substrWordsCount.get(word)> wordsCount.getOrDefault(word,0))
                return false;
        }
        return true;
    }
}
