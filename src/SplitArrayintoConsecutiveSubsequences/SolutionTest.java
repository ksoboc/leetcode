package SplitArrayintoConsecutiveSubsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertTrue(solution.isPossible(new int[]{1,2,3,3,4,5}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertTrue(solution.isPossible(new int[]{1,2,3,3,4,4,5,5}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertFalse(solution.isPossible(new int[]{1,2,3,4,4,5}));
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        assertTrue(solution.isPossible2(new int[]{1,2,3,3,4,5}));
    }
    @Test
    void test5() {
        Solution solution=new Solution();
        assertTrue(solution.isPossible2(new int[]{1,2,3,3,4,4,5,5}));
    }
    @Test
    void test6() {
        Solution solution=new Solution();
        assertFalse(solution.isPossible2(new int[]{1,2,3,4,4,5}));
    }

}