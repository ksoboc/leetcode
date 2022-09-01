package MinimumPathSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(int[][] grid, int expected) {
        assertEquals(expected, solution.minPathSum(grid));
    }

    private static Stream<Arguments> params() {
        return Stream.of(Arguments.of(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}, 7),
                Arguments.of(new int[][]{{1, 2, 3}, {4, 5, 6}}, 12));
    }

}