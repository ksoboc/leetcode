package MaximumSubarrayMinProduct;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(int[] arr, int expected) {
        assertEquals(expected, solution.maxSumMinProduct(arr));
    }

    private static Stream<Arguments> params() {
        return Stream.of(Arguments.of(new int[]{1, 2, 3, 2}, 14),
                Arguments.of(new int[]{2, 3, 3, 1, 2}, 18),
                Arguments.of(new int[]{3, 1, 5, 6, 4, 2}, 60));
    }

}