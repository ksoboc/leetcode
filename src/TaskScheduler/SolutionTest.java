package TaskScheduler;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(char[] tasks, int n, int expected) {
        assertEquals(expected, solution.leastInterval(tasks, n));
    }

    private static Stream<Arguments> params() {
        return Stream.of(Arguments.of(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2, 8),
                Arguments.of(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0, 6),
                Arguments.of(new char[]{'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}, 2, 16));
    }

}