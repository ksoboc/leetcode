package GreatestCommonDivisorofStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals("ABC", solution.gcdOfStrings("ABCABC", "ABC"));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals("AB", solution.gcdOfStrings("ABABAB", "ABAB"));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals("", solution.gcdOfStrings("LEET", "CODE"));
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        assertEquals("ABAB", solution.gcdOfStrings("ABAB", "ABABABAB"));
    }

}