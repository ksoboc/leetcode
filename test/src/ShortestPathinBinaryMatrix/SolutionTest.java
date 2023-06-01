package ShortestPathinBinaryMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};
        assertEquals(4, solution.shortestPathBinaryMatrix(grid));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] grid = {{1,0,0},{1,1,0},{1,1,0}};
        assertEquals(-1, solution.shortestPathBinaryMatrix(grid));
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        int[][] grid = {{0}};
        assertEquals(1, solution.shortestPathBinaryMatrix(grid));
    }
    @Test
    void test5() {
        Solution solution=new Solution();
        int[][] grid = {{0,1,1,0,1},{0,1,0,1,0},{0,1,0,1,0},{1,0,1,1,0},{1,1,1,1,0}};
        assertEquals(11, solution.shortestPathBinaryMatrix(grid));
    };


    @Test
    void test6() {
        int[][] grid = {{0,0,0,0,1},{1,0,0,0,0},{0,1,0,1,0},{0,0,0,1,1},{0,0,0,1,0}};
        Solution solution=new Solution();
        var res = solution.shortestPathBinaryMatrix(grid);
        System.out.println("res = " + res);

    }

}