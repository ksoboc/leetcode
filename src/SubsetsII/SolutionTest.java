package SubsetsII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(int[] nums, int expected) {
        var res = solution.subsetsWithDup(nums);
        System.out.println("res = " + res);
        assertEquals(expected,res.size());
    }

    @ParameterizedTest
    @MethodSource("params")
    void testIter(int[] nums, int expected) {
        var res = solution.subsetsWithDupIter(nums);
        System.out.println("res = " + res);
        assertEquals(expected,res.size());
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of(new int[]{5,5,5,5,5},6),
                Arguments.of(new int[]{1,1},3),
                Arguments.of(new int[]{1,2,2},6),
                Arguments.of(new int[]{0},2)
                );
    }

}