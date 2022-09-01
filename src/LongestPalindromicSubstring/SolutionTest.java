package LongestPalindromicSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        var res = solution.longestPalindrome("babad");
        assertTrue(res.equals("bab") || res.equals("aba"));
    }
    @Test
    void test2() {
        var res = solution.longestPalindrome("cbbd");
        assertEquals(res, "bb");
    }
    @Test
    void test3() {
        var res = solution.longestPalindrome("a");
        assertEquals(res, "a");
    }

}