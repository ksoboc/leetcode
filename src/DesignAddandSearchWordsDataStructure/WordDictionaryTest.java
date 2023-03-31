package DesignAddandSearchWordsDataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {
    @Test
    void test1() {
        WordDictionary wordDictionary=new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        var res=wordDictionary.search("pad"); // return False
        assertFalse(res);
        res=wordDictionary.search("bad"); // return True
        assertTrue(res);
        res=wordDictionary.search(".ad"); // return True
        assertTrue(res);
        res=wordDictionary.search("b.."); // return True
        assertTrue(res);
    }

}