package ValidPalindromeII;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;
    @BeforeEach
    void prep() {
        solution = new Solution();
    }
    @Test
    void test() {
        assertTrue(solution.validPalindrome("aba"));
    }
    @Test
    void test2() {
        assertTrue(solution.validPalindrome("abca"));
    }
    @Test
    void test3() {
        assertFalse(solution.validPalindrome("abc"));
    }
    @Test
    void test4() {
        assertTrue(solution.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }

}