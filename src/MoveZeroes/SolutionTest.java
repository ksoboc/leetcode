package MoveZeroes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(int[] nums, int[] expected) {
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @ParameterizedTest
    @MethodSource("params")
    void test2(int[] nums, int[] expected) {
        solution.moveZeroes2(nums);
        assertArrayEquals(expected, nums);
    }

    private static Stream<Arguments> params() {
        return Stream.of(Arguments.of(new int[]{0,1,0,3,12},new int[]{1,3,12,0,0}),
                Arguments.of(new int[]{0},new int[]{0}));
    }

}