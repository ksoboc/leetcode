package MinimumDeletionstoMakeCharacterFrequenciesUnique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.minDeletions("aab");
        assertEquals(0,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.minDeletions("aaabbbcc");
        assertEquals(2,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.minDeletions("ceabaacb");
        assertEquals(2,res);
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        var res = solution.minDeletions("bbcebab");
        assertEquals(2,res);
    }
}