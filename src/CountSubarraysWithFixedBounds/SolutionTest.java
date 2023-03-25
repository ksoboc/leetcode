package CountSubarraysWithFixedBounds;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("params")
    void test(int[] nums, int minK, int maxK, int expected) {
        Solution solution=new Solution();
        assertEquals(expected, solution.countSubarrays(nums,minK,maxK));
    }
    @ParameterizedTest
    @MethodSource("params")
    void test2(int[] nums, int minK, int maxK, int expected) {
        Solution solution=new Solution();
        assertEquals(expected, solution.countSubarrays2(nums,minK,maxK));
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of(new int[]{1,3,5,2,7,5},1,5,2),
                Arguments.of(new int[]{1,1,1,1},1,1,10));
    }


}