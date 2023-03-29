package ReducingDishes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @ParameterizedTest
    @MethodSource("testCases")
    void testMaxSatisfaction(int[] arr, int expected) {
        SolutionDP solution = new SolutionDP();
        assertEquals(expected, solution.maxSatisfaction(arr));
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{-1,-8,0,5,-9}, 14),
                Arguments.of(new int[]{4,3,2}, 20)
        );
    }
}