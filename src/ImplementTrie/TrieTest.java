package ImplementTrie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @Test
    void test() {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println("trie.search(\"apple\") = " + trie.search("apple"));
        System.out.println("trie.search(\"app\") = " + trie.search("app"));
        System.out.println("trie.startsWith(\"app\") = " + trie.startsWith("app"));
        trie.insert("app");
        System.out.println("trie.search(\"app\") = " + trie.search("app"));
    }

}