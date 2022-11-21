package ShortestPathinaGridwithObstaclesElimination;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] grid = {{0,0,0},{1,1,0},{0,0,0},{0,1,1},{0,0,0}};

        var res=solution.shortestPath(grid,1);

        System.out.println("res = " + res);
        assertEquals(6,res);

    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] grid = {{0,1,1},{1,1,1},{1,0,0}};

        var res=solution.shortestPath(grid,1);

        System.out.println("res = " + res);
        assertEquals(-1,res);

    }
    //
    @Test
    void test3() {
        Solution solution=new Solution();
        int[][] grid = {{0,1,0,0,0,1,0,0},{0,1,0,1,0,1,0,1},{0,0,0,1,0,0,1,0}};

        var res=solution.shortestPath(grid,1);

        System.out.println("res = " + res);
        assertEquals(13,res);
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        int[][] grid = {{0,0,1,0,0,0,0,1,0,1,1,0,0,1,1},{0,0,0,1,1,0,0,1,1,0,1,0,0,0,1},{1,1,0,0,0,0,0,1,0,1,0,0,1,0,0},{1,0,1,1,1,1,0,0,1,1,0,1,0,0,1},{1,0,0,0,1,1,0,1,1,0,0,1,1,1,1},{0,0,0,1,1,1,0,1,1,0,0,1,1,1,1},{0,0,0,1,0,1,0,0,0,0,1,1,0,1,1},{1,0,0,1,1,1,1,1,1,0,0,0,1,1,0},{0,0,1,0,0,1,1,1,1,1,0,1,0,0,0},{0,0,0,1,1,0,0,1,1,1,1,1,1,0,0},{0,0,0,0,1,1,1,0,0,1,1,1,0,1,0}};

        var res=solution.shortestPath(grid,27);

        System.out.println("res = " + res);
        assertEquals(24,res);
    }

}