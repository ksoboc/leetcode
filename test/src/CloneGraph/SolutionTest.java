package CloneGraph;

import Common.GraphUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test

    void test1() {
        Solution solution=new Solution();
        int[][] adjList = {{2,4},{1,3},{2,4},{1,3}};
        GraphUtil.Node graph = GraphUtil.createGraph(adjList);
        GraphUtil.Node clone = solution.cloneGraph(graph);
        int[][] adjList2 = GraphUtil.convertGraph(clone);

        System.out.println("adjList2 = " + Arrays.deepToString(adjList2));
        assertArrayEquals(adjList,adjList2);
    }

}