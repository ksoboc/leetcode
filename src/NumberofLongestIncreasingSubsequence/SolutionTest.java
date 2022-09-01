package NumberofLongestIncreasingSubsequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(int[] nums, int expected) {
        assertEquals(expected,solution.findNumberOfLIS(nums));
    }

    private static Stream<Arguments> params() {
        return Stream.of(Arguments.of(new int[]{1,3,5,4,7},2),
                Arguments.of(new int[]{2,2,2,2,2},5));
    }

}