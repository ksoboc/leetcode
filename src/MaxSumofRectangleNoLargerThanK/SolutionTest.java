package MaxSumofRectangleNoLargerThanK;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution=new Solution();
        assertEquals(2,solution.maxSumSubmatrix(new int[][]{{1,0,1},{0,-2,3}},2));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(3,solution.maxSumSubmatrix(new int[][]{{2,2,-1}},3));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(-1,solution.maxSumSubmatrix(new int[][]{{2,2,-1}},0));
    }

}