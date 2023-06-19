package FindtheHighestAltitude;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> params() {
        return Stream.of(Arguments.of(new int[]{-5, 1, 5, 0, -7}, 1),
                Arguments.of(new int[]{-4, -3, -2, -1, 4, 3, 2}, 0));
    }

    @ParameterizedTest
    @MethodSource("params")
    void test(int[] gain, int expected) {
        Solution solution = new Solution();
        assertEquals(expected, solution.largestAltitude(gain));
    }

}