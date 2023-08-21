package RepeatedSubstringPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertTrue(solution.repeatedSubstringPattern("abab"));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertFalse(solution.repeatedSubstringPattern("aba"));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertTrue(solution.repeatedSubstringPattern("abcabcabcabc"));
    }

}