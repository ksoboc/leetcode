package PalindromeNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    void test1() {
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void test3() {
        assertFalse(solution.isPalindrome(10));
    }

    @Test
    void test4() {
        assertTrue(solution.isPalindrome(1410110141));
    }

}