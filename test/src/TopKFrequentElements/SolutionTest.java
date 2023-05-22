package TopKFrequentElements;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of(new int[]{1,1,1,2,2,3},2,new int[]{1,2}),
                Arguments.of(new int[]{1},1,new int[]{1}));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] nums, int k, int[] expected) {
        Solution solution=new Solution();
        var answer = solution.topKFrequent(nums,k);
        Arrays.sort(answer);
        assertArrayEquals(expected,answer);
    }

}