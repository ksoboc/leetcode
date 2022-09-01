package BrickWall;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(List<List<Integer>> wall, int expected) {
        assertEquals(expected, solution.leastBricks(wall));

    }

    private static Stream<Arguments> params() {
        return Stream.of(Arguments.of(List.of(List.of(1, 2, 2, 1), List.of(3, 1, 2), List.of(1, 3, 2), List.of(2, 4), List.of(3, 1, 2), List.of(1, 3, 1, 1)), 2),
                Arguments.of(List.of(List.of(1), List.of(1), List.of(1)), 3));
    }

}