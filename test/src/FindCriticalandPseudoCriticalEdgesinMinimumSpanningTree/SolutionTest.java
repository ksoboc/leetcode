package FindCriticalandPseudoCriticalEdgesinMinimumSpanningTree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] edges = {{0,1,1},{1,2,1},{2,3,2},{0,3,2},{0,4,3},{3,4,3},{1,4,6}};
        var res = solution.findCriticalAndPseudoCriticalEdges(5,edges);
        assertEquals(List.of(List.of(0,1),List.of(2,3,4,5)),res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] edges = {{0,1,1},{1,2,1},{2,3,1},{0,3,1}};
        var res = solution.findCriticalAndPseudoCriticalEdges(4,edges);
        assertEquals(List.of(List.of(),List.of(0,1,2,3)),res);
    }

}