package Pattern132;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest(name = "{index} {0} contains 132 sequence {1}")
    @MethodSource("arguments")
    void test(int[] arr, boolean expected) {
        assertEquals(expected, solution.find132pattern(arr));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, false),
                Arguments.of(new int[]{3, 1, 4, 2}, true),
                Arguments.of(new int[]{-1, 3, 2, 0}, true),
                Arguments.of(new int[]{1,2,3,4,-4,-3,-5,-1}, false));
    }

}