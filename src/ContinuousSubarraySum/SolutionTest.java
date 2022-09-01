package ContinuousSubarraySum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(int[] nums, int k, boolean expected) {
        assertEquals(expected, solution.checkSubarraySum(nums, k));
    }

    private static Stream<Arguments> params() {
        return Stream.of(Arguments.of(new int[]{23, 2, 4, 6, 7}, 6, true),
                Arguments.of(new int[]{23, 2, 6, 4, 7}, 6, true),
                Arguments.of(new int[]{23, 2, 6, 4, 7}, 13, false));
    }

}