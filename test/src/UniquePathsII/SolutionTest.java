package UniquePathsII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] obstacles = {{0,0,0},{0,1,0},{0,0,0}};
        var res = solution.uniquePathsWithObstacles(obstacles);
        assertEquals(2,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] obstacles = {{0,1},{0,0}};
        var res = solution.uniquePathsWithObstacles(obstacles);
        assertEquals(1,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[][] obstacles = {{0,0},{0,0}};
        var res = solution.uniquePathsWithObstacles(obstacles);
        assertEquals(2,res);
    }

}