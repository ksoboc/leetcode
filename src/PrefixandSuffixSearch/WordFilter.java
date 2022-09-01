package PrefixandSuffixSearch;

import java.util.*;

public class WordFilter {
    private TrieNode pTrie = new TrieNode();
    private TrieNode sTrie = new TrieNode();
    public WordFilter(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            addToTrie(word, i, pTrie, 0, word.length(), 1);
            addToTrie(word, i, sTrie, word.length()-1, -1, -1);
        }

    }

    private void addToTrie(String word, int index, TrieNode trie, int start, int end, int step) {
        for (int i = start; i !=end ; i+=step) {
            char ch = word.charAt(i);
            int idx = ch - 'a';
            if (trie.children[idx]==null)
                trie.children[idx] = new TrieNode();
            trie = trie.children[idx];
            trie.vals.add(index);
        }
    }

    private List<Integer> getVals(String word, TrieNode trie, int start, int end, int step) {
        for (int i = start; i != end ; i+=step) {
            char ch = word.charAt(i);
            int idx=ch-'a';
            if (trie.children[idx]==null)
                return Collections.emptyList();
            trie = trie.children[idx];

        }
        return trie.vals;

    }

    public int f(String prefix, String suffix) {
        List<Integer> pVals = getVals(prefix, pTrie, 0, prefix.length(), 1);
        List<Integer> sVals = getVals(suffix, sTrie, suffix.length()-1, -1, -1);
        int pvix = pVals.size()-1; int svix=sVals.size()-1;
        while (pvix>=0 && svix>=0) {
            int pVal = pVals.get(pvix); int sVal = sVals.get(svix);
            if (pVal==sVal)
                return pVal;
            if (pVal>sVal)
                --pvix;
            else
                --svix;
        }
        return -1;
    }
}

class TrieNode {
    List<Integer> vals;
    TrieNode[] children;

    public TrieNode() {
        children=new TrieNode[26];
        vals = new ArrayList<>();
    }
}