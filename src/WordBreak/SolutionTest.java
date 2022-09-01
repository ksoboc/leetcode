package WordBreak;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        assertTrue(solution.wordBreak("leetcode", List.of("leet","code")));
    }
    @Test
    void test2() {
        assertTrue(solution.wordBreak("applepenapple", List.of("apple","pen")));
    }
    @Test
    void test3() {
        assertFalse(solution.wordBreak("catsandog", List.of("cats","dog","sand","and","cat")));
    }

}