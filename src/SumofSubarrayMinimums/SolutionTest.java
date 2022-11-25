package SumofSubarrayMinimums;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("params")
    void test(int expected, int[] arr) {
        Solution solution=new Solution();
        assertEquals(expected,solution.sumSubarrayMins(arr));
    }


    static Stream<Arguments> params() {
        return Stream.of(Arguments.of(17,new int[]{3,1,2,4}),
                Arguments.of(444,new int[]{11,81,94,43,3}));
    }


}