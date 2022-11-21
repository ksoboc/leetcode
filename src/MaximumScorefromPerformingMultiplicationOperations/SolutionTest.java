package MaximumScorefromPerformingMultiplicationOperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(14,solution.maximumScore(new int[]{1,2,3},new int[]{3,2,1}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(102,solution.maximumScore(new int[]{-5,-3,-3,-2,7,1},new int[]{-10,-5,3,4,6}));
    }

}