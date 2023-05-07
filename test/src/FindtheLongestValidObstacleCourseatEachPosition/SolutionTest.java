package FindtheLongestValidObstacleCourseatEachPosition;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of(new int[]{1, 2, 3, 2}, new int[]{1, 2, 3, 3}),
                Arguments.of(new int[]{2, 2, 1}, new int[]{1, 2, 1}),
                Arguments.of(new int[]{3, 1, 5, 6, 4, 2}, new int[]{1, 1, 2, 3, 2, 2}));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] obstacles, int[] expected) {
        Solution solution = new Solution();
        assertArrayEquals(expected, solution.longestObstacleCourseAtEachPosition(obstacles));
    }

}