package IsGraphBipartite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionBFSTest {
    @Test
    void test1() {
        SolutionBFS solution=new SolutionBFS();
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        assertFalse(solution.isBipartite(graph));
    }
    @Test
    void test2() {
        SolutionBFS solution=new SolutionBFS();
        int[][] graph = {{1,3},{0,2},{1,3},{0,2}};
        assertTrue(solution.isBipartite(graph));
    }

}