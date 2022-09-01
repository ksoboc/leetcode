package LongestSubstringWithoutRepeateingCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        var s = "abcabcbb";
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void test1() {
        Solution solution = new Solution();
        var s = "bbbbb";
        assertEquals(1, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        var s = "pwwkew";
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }
}