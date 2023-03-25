package CountUnreachablePairsofNodesinanUndirectedGraph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(0, solution.countPairs(3,new int[][]{{0,1},{0,2},{1,2}}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(14, solution.countPairs(7,new int[][]{{0,2},{0,5},{2,4},{1,6},{5,4}}));
    }

}