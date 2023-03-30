package ScrambleString;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("testData")
    void test(String s1, String s2, boolean expected) {
        Solution solution = new Solution();
        assertEquals(expected, solution.isScramble(s1, s2));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(Arguments.of("great","rgeat",true),
                Arguments.of("abcde","caebd",false));
    }
}