package UniquePathsIII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(2, solution.uniquePathsIII(new int[][]{{1,0,0,0},{0,0,0,0},{0,0,2,-1}}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(4, solution.uniquePathsIII(new int[][]{{1,0,0,0},{0,0,0,0},{0,0,0,2}}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(0, solution.uniquePathsIII(new int[][]{{0,1},{2,0}}));
    }

}