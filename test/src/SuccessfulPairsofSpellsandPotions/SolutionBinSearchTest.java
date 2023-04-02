package SuccessfulPairsofSpellsandPotions;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionBinSearchTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7, new int[]{4, 0, 3}),
                Arguments.of(new int[]{3, 1, 2}, new int[]{8, 5, 8}, 16, new int[]{2, 0, 2}));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] spells, int[] potions, int success, int[] expected) {
        SolutionBinSearch solution = new SolutionBinSearch();
        assertArrayEquals(expected, solution.successfulPairs(spells, potions, success));
    }


}