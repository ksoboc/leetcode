package LargestColorValueinaDirectedGraph;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("iiiiii", new int[][]{{0,1},{1,2},{2,3},{3,4},{4,5}},6),
                Arguments.of("abaca", new int[][]{{0,1},{0,2},{2,3},{3,4}},3),
                Arguments.of("a",new int[][]{{0,0}},-1));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(String colors, int[][] edges, int expected) {
        Solution solution=new Solution();
        assertEquals(expected,solution.largestPathValue(colors,edges));
    }

}