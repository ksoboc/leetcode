package LongestPalindromicSubsequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("bbbab",4),
                Arguments.of("cbbd",2));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(String s, int expected) {
        SolutionDP solution=new SolutionDP();
        assertEquals(expected,solution.longestPalindromeSubseq(s));
    }

}