package UniquePathsII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        int[][] obstacles = {{0,0,0},{0,1,0},{0,0,0}};
        var res = solution.uniquePathsWithObstacles(obstacles);
        assertEquals(2,res);
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        int[][] obstacles = {{0,1},{0,0}};
        var res = solution.uniquePathsWithObstacles(obstacles);
        assertEquals(1,res);
    }

}