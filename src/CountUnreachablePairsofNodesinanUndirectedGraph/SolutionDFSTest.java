package CountUnreachablePairsofNodesinanUndirectedGraph;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDFSTest {

    @ParameterizedTest
    @MethodSource("testData")
    void test(int expected, int n, int[][] edges) {
        SolutionDFS solution=new SolutionDFS();
        assertEquals(expected,solution.countPairs(n,edges));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(14,7,new int[][]{{0,2},{0,5},{2,4},{1,6},{5,4}}),
                Arguments.of(0,3,new int[][]{{0,1},{0,2},{1,2}})
                );
    }
}