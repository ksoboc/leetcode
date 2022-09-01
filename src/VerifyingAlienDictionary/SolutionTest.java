package VerifyingAlienDictionary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();
        String[] words = {"hello","leetcode"};
        var order = "hlabcdefgijkmnopqrstuvwxyz";

        assertTrue(solution.isAlienSorted(words,order));
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        String[] words = {"word","world","row"};
        var order = "worldabcefghijkmnpqstuvxyz";

        assertFalse(solution.isAlienSorted(words,order));
    }

    @Test
    void test3() {
        Solution solution = new Solution();
        String[] words = {"apple","app"};
        var order = "abcdefghijklmnopqrstuvwxyz";

        assertFalse(solution.isAlienSorted(words,order));
    }

}