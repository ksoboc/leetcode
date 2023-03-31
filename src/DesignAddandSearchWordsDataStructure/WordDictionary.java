package DesignAddandSearchWordsDataStructure;

public class WordDictionary {
    private static class TrieNode {
        private TrieNode[] chars;
        private boolean isEndOfWord;

        public TrieNode() {
            chars = new TrieNode[26];
        }
    }

    private TrieNode trie;

    public WordDictionary() {
        trie = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = trie;
        for (var ch : word.toCharArray()) {
            int index = ch - 'a';
            if (curr.chars[index] == null) {
                curr.chars[index] = new TrieNode();
            }
            curr = curr.chars[index];
        }
        curr.isEndOfWord = true;
    }

    public boolean search(String word) {
        return search(word, trie);
    }

    private boolean search(String word, TrieNode trie) {
        TrieNode node = trie;
        for (int i = 0; i < word.length(); ++i) {
            char ch = word.charAt(i);
            if (ch == '.') {
                for (var subTrie : node.chars) {
                    if (subTrie == null)
                        continue;
                    if (search(word.substring(i + 1), subTrie))
                        return true;
                }
                return false;
            }
            int index = ch - 'a';
            if (node.chars[index] == null)
                return false;
            node = node.chars[index];
        }
        return node.isEndOfWord;
    }
}
