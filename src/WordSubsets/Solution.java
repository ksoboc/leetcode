package WordSubsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] freq = new int[26];

        for (var word:words2) {
            int[] wordFreq = getCharFreqForWord(word);
            for (var i=0;i<wordFreq.length;++i) {
                freq[i] = Math.max(freq[i], wordFreq[i]);
                ;
            }
        }

        List<String> res = new ArrayList<>();
        for (var word:words1) {
            int[] wordFreq = getCharFreqForWord(word);
            boolean isUniv = true;
            for (var i=0;i<freq.length;++i) {
                if (freq[i]>wordFreq[i]) {
                    isUniv=false;
                    break;
                }
            }
            if (isUniv)
                res.add(word);
        }
        return res;
    }

    private int[] getCharFreqForWord(String word) {
        int[] wordFreq = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            ++wordFreq[ch - 'a'];
        }
        return wordFreq;
    }
}
