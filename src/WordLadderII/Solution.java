package WordLadderII;

import java.util.*;

public class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, Set<String>> reverse = new HashMap<>(); // reverse graph start from endWord
        Deque<String> queue = new ArrayDeque<>(); // store current layer nodes
        queue.add(beginWord); // first layer has only beginWord

        Set<String> wordsToOmit = new HashSet<>();
        wordsToOmit.add(beginWord);
        Map<String, List<String>> patternToWords = new HashMap<>();
        HashSet<String> wlSet = new HashSet<>(wordList);
        if (!wlSet.contains(beginWord))
            wlSet.add(beginWord);
        for (var word : wlSet) {
            for (int i = 0; i < word.length(); i++) {
                var pattern = word.substring(0, i) + "*" + word.substring(i + 1);
                List<String> list = patternToWords.getOrDefault(pattern, new ArrayList<>());
                list.add(word);
                patternToWords.put(pattern, list);
            }
        }

        boolean findEnd = false; // find endWord flag
        while (true) {
            Set<String> nextLevel = new HashSet<>(); // store nextLayer nodes
            int qsize = queue.size();
            while (qsize>0) { // traverse current layer nodes
                String word = queue.poll();
                for (int j = 0; j < word.length(); j++) {
                    var pattern = word.substring(0, j) + "*" + word.substring(j + 1);
                    for (var neiWord : patternToWords.get(pattern)) {
                        if (!wordsToOmit.contains(neiWord)) {
                            Set<String> reverseLadders = reverse.computeIfAbsent(neiWord, k -> new HashSet<>());
                            reverseLadders.add(word);
                            if (endWord.equals(neiWord)) {
                                findEnd = true;
                            }
                            nextLevel.add(neiWord); // store next layer nodes
                        }

                    }

                }
                --qsize;
            }
            if (findEnd || nextLevel.isEmpty()) break; // if find the endWord, then break the while loop

            queue.addAll(nextLevel); // add next layer nodes to queue
            wordsToOmit.addAll(nextLevel);

        }
        if (!findEnd) return ans; // if can't reach endWord from startWord, then return ans.
        Set<String> path = new LinkedHashSet<>();
        path.add(endWord);
        // traverse reverse graph from endWord to beginWord
        findPath(endWord, beginWord, reverse, ans, path);
        return ans;
    }


    private void findPath(String endWord, String beginWord, Map<String, Set<String>> graph,
                          List<List<String>> ans, Set<String> path) {
        Set<String> next = graph.get(endWord);
        if (next == null) return;
        for (String word : next) {

            path.add(word);
            if (beginWord.equals(word)) {
                List<String> shortestPath = new ArrayList<>(path);
                Collections.reverse(shortestPath); // reverse words in shortest path
                ans.add(shortestPath); // add the shortest path to ans.
            } else {

                findPath(word, beginWord, graph, ans, path);
            }
            path.remove(word);
        }
    }

    private boolean isLadder(String s, String t) {
        if (s.length() != t.length()) return false;
        int diffCount = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i)) diffCount++;
            if (diffCount > 1) return false;
        }
        return diffCount == 1;
    }

    public List<List<String>> findLadders2(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord))
            return Collections.emptyList();

        Map<String, List<String>> patternToWords = new HashMap<>();
        Set<String> wordListSet = new HashSet<>(wordList);
        if (!wordListSet.contains(beginWord))
            wordListSet.add(beginWord);
        for (var word : wordListSet) {
            for (int i = 0; i < word.length(); i++) {
                var pattern = word.substring(0, i) + "*" + word.substring(i + 1);
                List<String> list = patternToWords.getOrDefault(pattern, new ArrayList<String>());
                list.add(word);
                patternToWords.put(pattern, list);
            }
        }

        List<List<String>> paths = new ArrayList<>();
        paths.add(new ArrayList<>(List.of(beginWord)));
        List<List<String>> ans = new ArrayList<>();
        boolean found = false;
        while (!paths.isEmpty()) {

            List<List<String>> newPaths = new ArrayList<>();
            for (var path:paths) {
                var word = path.get(path.size()-1);

                for (int j = 0; j < word.length(); j++) {
                    var pattern = word.substring(0, j) + "*" + word.substring(j + 1);
                    for (var neiWord : patternToWords.get(pattern)) {
                        if (!path.contains(neiWord)) {
                            List<String> list = new ArrayList<>(path);
                            list.add(neiWord);
                            newPaths.add(list);
                            found |= neiWord.equals(endWord);
                        }

                    }

                }
           }
            paths=newPaths;
            if (found) {
                for (var list : paths) {
                    if (list.get(list.size() - 1).equals(endWord))
                        ans.add(list);
                }
                break;
            }
        }
        return ans;
    }
}
