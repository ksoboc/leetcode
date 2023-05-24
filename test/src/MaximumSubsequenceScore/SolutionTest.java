package MaximumSubsequenceScore;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of(new int[]{1, 3, 3, 2}, new int[]{2, 1, 3, 4}, 3, 12),
                Arguments.of(new int[]{4, 2, 3, 1, 1}, new int[]{7, 5, 10, 9, 6}, 1, 30));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test1(int[] nums1, int[] nums2, int k, long expected) {
        Solution solution = new Solution();
        var res = solution.maxScore(nums1, nums2, k);
        assertEquals(expected, res);
    }


}