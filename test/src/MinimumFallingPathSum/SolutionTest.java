package MinimumFallingPathSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(13, solution.minFallingPathSum(new int[][]{{2,1,3},{6,5,4},{7,8,9}}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(-59, solution.minFallingPathSum(new int[][]{{-19,57},{-40,-5}}));
    }

}