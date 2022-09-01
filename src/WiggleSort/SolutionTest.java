package WiggleSort;

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
    void test(int[] arr, int[] expected) {
        solution.wiggleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @ParameterizedTest
    @MethodSource("params")
    void test2(int[] arr, int[] expected) {
        solution.wiggleSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 2, 1, 6, 4}, new int[]{1, 6, 2, 5, 3, 4}),
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 4, 2, 3})
        );
    }

}