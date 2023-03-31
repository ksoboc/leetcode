package FindtheIndexoftheFirstOccurrenceinaString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoyerMooreTest {
    @Test
    void test1() {

        assertEquals(0, BoyerMoore.findSubstring("sadbysad", "sad"));
    }
    @Test
    void test2() {

        assertEquals(-1, BoyerMoore.findSubstring("leetcode", "leeto"));
    }
    @Test
    void test3() {

        assertEquals(2, BoyerMoore.findSubstring("hello", "ll"));
    }
    @Test
    void test4() {

        assertEquals(0, BoyerMoore.findSubstring("a", "a"));
    }
    @Test
    void test5() {

        assertEquals(1, BoyerMoore.findSubstring("abbaaaababa", "bbaaaababa"));
    }

}