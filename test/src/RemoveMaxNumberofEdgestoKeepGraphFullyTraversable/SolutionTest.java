package RemoveMaxNumberofEdgestoKeepGraphFullyTraversable;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of(4, new int[][]{{3, 1, 2}, {3, 2, 3}, {1, 1, 3}, {1, 2, 4}, {1, 1, 2}, {2, 3, 4}}, 2),
                Arguments.of(4, new int[][]{{3, 1, 2}, {3, 2, 3}, {1, 1, 4}, {2, 1, 4}}, 0),
                Arguments.of(4, new int[][]{{3, 2, 3}, {1, 1, 2}, {2, 3, 4}}, -1));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test1(int n, int[][] edges, int expected) {
        Solution solution = new Solution();
        var res = solution.maxNumEdgesToRemove(n, edges);
        assertEquals(expected, res);
    }

}