package WordBreak;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        assertTrue(solution.wordBreak("leetcode", List.of("leet","code")));
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        assertTrue(solution.wordBreak("applepenapple", List.of("apple","pen")));
    }
    @Test
    void test3() {
        SolutionDP solution=new SolutionDP();
        assertFalse(solution.wordBreak("catsandog", List.of("cats","dog","sand","and","cat")));
    }

}