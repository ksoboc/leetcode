package ShortestPathVisitingAllNodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] graph = {{1,2,3},{0},{0},{0}};
        var res = solution.shortestPathLength(graph);

        assertEquals(4,res);

    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] graph = {{1},{0,2,4},{1,3,4},{2},{1,2}};
        var res = solution.shortestPathLength(graph);

        assertEquals(4,res);

    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[][] graph = {{1,2,3,4,5,6,7,8,9},{0,2,3,4,5,6,7,8,9},{0,1,3,4,5,6,7,8,9},{0,1,2,4,5,6,7,8,9},{0,1,2,3,5,6,7,8,9},{0,1,2,3,4,6,7,8,9},{0,1,2,3,4,5,7,8,9},{0,1,2,3,4,5,6,8,9},{0,1,2,3,4,5,6,7,9,10},{0,1,2,3,4,5,6,7,8,11},{8},{9}};
        var res = solution.shortestPathLength(graph);

        assertEquals(11,res);

    }

}