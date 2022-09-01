package FindMissingObservations;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(int[] rolls, int mean, int n, int[] expected) {
        int[] res = solution.missingRolls(rolls, mean, n);
        System.out.println("res = " + Arrays.toString(res));
        assertArrayEquals(expected, res);
    }

    private static Stream<Arguments> params() {
        return Stream.of(Arguments.of(new int[]{3, 2, 4, 3}, 4, 2, new int[]{6, 6}),
                Arguments.of(new int[]{1, 5, 6}, 3, 4, new int[]{6, 1, 1, 1}));
    }

}