package PrefixandSuffixSearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {
    private WordFilter wordFilter;

    @Test
    void test() {
        wordFilter=new WordFilter(new String[]{"apple"});
        var res = wordFilter.f("a","e");
        assertEquals(0,res);
    }

    @Test
    void test2() {
        wordFilter=new WordFilter(new String[]{"cabaabaaaa","ccbcababac","bacaabccba","bcbbcbacaa","abcaccbcaa","accabaccaa","cabcbbbcca","ababccabcb","caccbbcbab","bccbacbcba"});
        var res = wordFilter.f("bccbacbcba","a");
        assertEquals(9,res);
    }

}