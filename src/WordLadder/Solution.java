package WordLadder;

import java.util.*;

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord))
            return 0;

        Map<String, List<String>> patternToWords = new HashMap<>();
        if (!wordList.contains(beginWord))
            wordList.add(beginWord);
        for (var word : wordList) {
            for (int i = 0; i < word.length(); i++) {
                var pattern = word.substring(0, i) + "*" + word.substring(i + 1);
                List<String> list = patternToWords.getOrDefault(pattern, new ArrayList<String>());
                list.add(word);
                patternToWords.put(pattern, list);
            }
        }

        Set<String> visited = new HashSet<>();
        Deque<String> deque = new ArrayDeque<>();
        deque.add(beginWord);
        visited.add(beginWord);
        var res = 1;
        while (!deque.isEmpty()) {
            var size = deque.size();
            for (int i = 0; i < size; i++) {
                var word = deque.poll();
                if (word.equals(endWord))
                    return res;
                for (int j = 0; j < word.length(); j++) {
                    var pattern = word.substring(0, j) + "*" + word.substring(j + 1);
                    for (var neiWord : patternToWords.get(pattern)) {
                        if (!visited.contains(neiWord)) {
                            deque.offer(neiWord);
                            visited.add(neiWord);
                        }

                    }

                }
            }
            res += 1;
        }
        return 0;
    }
}
