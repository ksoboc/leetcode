package MaximizeScoreAfterNOperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(1, solution.maxScore(new int[]{1,2}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(11, solution.maxScore(new int[]{3,4,6,8}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(14, solution.maxScore(new int[]{1,2,3,4,5,6}));
    }

}