package FindEventualSafeStates;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] graph={{1,2},{2,3},{5},{0},{5},{},{}};
        var res=solution.eventualSafeNodes(graph);
        assertEquals(List.of(2,4,5,6),res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] graph={{1,2,3,4},{1,2},{3,4},{0,4},{}};
        var res=solution.eventualSafeNodes(graph);
        assertEquals(List.of(4),res);
    }

}