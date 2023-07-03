package BuddyStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertTrue(solution.buddyStrings("ab","ba"));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertFalse(solution.buddyStrings("ab","ab"));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertTrue(solution.buddyStrings("aa","aa"));
    }

}