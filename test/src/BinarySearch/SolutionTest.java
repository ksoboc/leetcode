package BinarySearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("testCases")
    void test(int[] nums, int target, int expected) {
        Solution solution = new Solution();
        assertEquals(expected, solution.search(nums, target));
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{-1,0,3,5,9,12}, 9, 4),
                Arguments.of(new int[]{-1,0,3,5,9,12}, 2, -1)
        );
    }
}