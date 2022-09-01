package GridGame;

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
        assertEquals(expected, solution.gridGame(grid));
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of(new int[][]{{3, 3, 1}, {8, 5, 2}}, 4),
                Arguments.of(new int[][]{{2, 5, 4}, {1, 5, 1}}, 4)
                );
    }

}