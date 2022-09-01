package EliminateMaximumNumberofMonsters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(int[] dist, int[] speed, int expected) {
        assertEquals(expected, solution.eliminateMaximum(dist, speed));

    }

    @ParameterizedTest
    @MethodSource("params")
    void testHeap(int[] dist, int[] speed, int expected) {
        assertEquals(expected, solution.eliminateMaximumHeap(dist, speed));

    }

    private static Stream<Arguments> params() {
        return Stream.of(Arguments.of(new int[]{1, 3, 4}, new int[]{1, 1, 1}, 3),
                Arguments.of(new int[]{1, 1, 2, 3}, new int[]{1, 1, 1, 1}, 1),
                Arguments.of(new int[]{3, 2, 4}, new int[]{5, 3, 2}, 1));
    }

}