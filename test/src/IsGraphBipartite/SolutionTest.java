package IsGraphBipartite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        assertFalse(solution.isBipartite(graph));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] graph = {{1,3},{0,2},{1,3},{0,2}};
        assertTrue(solution.isBipartite(graph));
    }

}