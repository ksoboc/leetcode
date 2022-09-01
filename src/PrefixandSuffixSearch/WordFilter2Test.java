package PrefixandSuffixSearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordFilter2Test {
    private WordFilter2 wordFilter2;

    @Test
    void test() {
        wordFilter2=new WordFilter2(new String[]{"apple"});
        var res = wordFilter2.f("a","e");
        assertEquals(0,res);
    }

    @Test
    void test2() {
        wordFilter2=new WordFilter2(new String[]{"cabaabaaaa","ccbcababac","bacaabccba","bcbbcbacaa","abcaccbcaa","accabaccaa","cabcbbbcca","ababccabcb","caccbbcbab","bccbacbcba"});
        var res = wordFilter2.f("bccbacbcba","a");
        assertEquals(9,res);
    }


}