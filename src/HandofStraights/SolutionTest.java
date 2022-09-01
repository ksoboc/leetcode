package HandofStraights;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(int[] nums, int groupSize, boolean expected) {
        assertEquals(expected, solution.isNStraightHand(nums, groupSize));
    }

    @ParameterizedTest
    @MethodSource("params")
    void testTM(int[] nums, int groupSize, boolean expected) {
        assertEquals(expected, solution.isNStraightHandTM(nums, groupSize));
    }


    private static Stream<Arguments> params() {
        return Stream.of(Arguments.of(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3, true),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4, false));
    }

}