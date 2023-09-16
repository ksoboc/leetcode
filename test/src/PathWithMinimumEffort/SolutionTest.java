package PathWithMinimumEffort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] heights = {{1,2,2},{3,8,2},{5,3,5}};
        var res = solution.minimumEffortPath(heights);
        assertEquals(2,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] heights = {{1,2,3},{3,8,4},{5,3,5}};
        var res = solution.minimumEffortPath(heights);
        assertEquals(1,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[][] heights = {{1,2,1,1,1},{1,2,1,2,1},{1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}};
        var res = solution.minimumEffortPath(heights);
        assertEquals(0,res);
    }

}