package ImplementTrie;

import java.util.HashMap;
import java.util.Map;


public class Trie {
    TrieNode root;

    class TrieNode {
        Map<Character,TrieNode> children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new HashMap<>();
            isEndOfWord=false;
        }
    }

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode curr = root;
        for (var i=0; i<word.length();++i) {
            char ch = word.charAt(i);
            if (!curr.children.containsKey(ch)) {
                curr.children.put(ch, new TrieNode());
            }
            curr = curr.children.get(ch);
        }
        curr.isEndOfWord = true;

    }

    public boolean search(String word) {
        var curr = root;

        for (var i=0;i<word.length();++i) {
            char ch = word.charAt(i);
            if (!curr.children.containsKey(ch))
                return false;
            curr = curr.children.get(ch);
        }
        return curr.isEndOfWord;

    }

    public boolean startsWith(String prefix) {
        var curr = root;

        for (var i=0;i<prefix.length();++i) {
            char ch = prefix.charAt(i);
            if (!curr.children.containsKey(ch))
                return false;
            curr = curr.children.get(ch);
        }
        return true;
    }
}

