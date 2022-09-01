package WordSearchII;

import java.util.*;

class TrieNode {
    Map<Character, TrieNode> chars;
    boolean isWord;

    public TrieNode() {
        chars = new HashMap<>();
        isWord = false;
    }

    public void addWord(String word) {
        TrieNode node = this;
        for (var i = 0; i < word.length(); ++i) {
            var ch = word.charAt(i);
            if (!node.chars.containsKey(ch)) {
                node.chars.put(ch, new TrieNode());
            }
            node = node.chars.get(ch);
        }
        node.isWord = true;
    }
}

public class Solution {
    int nrCols;
    int nrRows;
    char[][] board;
    Set<String> res = new HashSet<>();
    Set<Integer> visited = new HashSet<>();

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        for (var word : words) {
            root.addWord(word);
        }
        this.board = board;
        nrRows = board.length;
        nrCols = board[0].length;

        outer:
        for (var r = 0; r < nrRows; ++r) {
            for (var c = 0; c < nrCols; ++c) {
                backtrack(r, c, root, "");
                if (res.size()>=words.length)
                    break outer;
            }
        }
        return new ArrayList<>(res);
    }

    private void backtrack(int r, int c, TrieNode node, String word) {
        if (r < 0 || r >= nrRows || c < 0 || c >= nrCols || visited.contains(r * nrCols + c) || !node.chars.containsKey(board[r][c]))
            return;


        visited.add(r * nrCols + c);
        word += board[r][c];

        TrieNode next = node.chars.get(board[r][c]);
        if (next.isWord)
            res.add(word);
        backtrack(r + 1, c, next, word);
        backtrack(r - 1, c, next, word);
        backtrack(r, c + 1, next, word);
        backtrack(r, c - 1, next, word);

        visited.remove(r * nrCols + c);

    }
}
