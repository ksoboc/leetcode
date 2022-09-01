package NumberofMatchingSubsequences;

import java.util.*;

public class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<Character, Deque<String>> map = new HashMap<>();
        for (var word : words) {
            var ch = word.charAt(0);
            var queue = map.getOrDefault(ch, new ArrayDeque<>());
            queue.offer(word);
            map.put(ch, queue);
        }

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            var ch = s.charAt(i);
            if (!map.containsKey(ch))
                continue;
            int size = map.get(ch).size();
            for (int j = 0; j < size; ++j) {
                var word = map.get(ch).poll();
                if (word.length() == 1) {
                    ++res;
                    continue;
                }
                var queue = map.getOrDefault(word.charAt(1), new ArrayDeque<>());
                queue.offer(word.substring(1));
                map.put(word.charAt(1), queue);
            }
        }

        return res;

    }

    public int numMatchingSubseq2(String s, String[] words) {
        int[][] rightPos = new int[s.length()][26];
        Arrays.fill(rightPos[s.length()-1], -1);
        for (int i = s.length()-1; i >= 0; --i) {
            if (i+1<s.length())
                rightPos[i] = Arrays.copyOf(rightPos[i+1], 26);
            rightPos[i][s.charAt(i)-'a'] = i;
        }
        int res=0;
        for (var word:words) {
            if (subSeq(rightPos, word, s.length()))
                ++res;
        }
        return res;
    }

    private boolean subSeq(int[][] rightPos, String word, int slength) {
        int currIdx = 0;
        for (int i = 0; i < word.length(); i++) {
            int nextIdx = rightPos[currIdx][word.charAt(i)-'a'];
            if (nextIdx==-1 || (i!=word.length()-1 && nextIdx >= slength-1))
                return false;
            currIdx=nextIdx+1;
        }
        return true;
    }
}
