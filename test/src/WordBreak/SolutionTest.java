package WordBreak;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertTrue(solution.wordBreak("leetcode", List.of("leet","code")));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertTrue(solution.wordBreak("applepenapple", List.of("apple","pen")));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertFalse(solution.wordBreak("catsandog", List.of("cats","dog","sand","and","cat")));
    }

}