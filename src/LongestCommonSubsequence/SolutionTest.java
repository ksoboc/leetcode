package LongestCommonSubsequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @ParameterizedTest
    @MethodSource("parametry")
    void test(String t1, String t2, int expected) {
        assertEquals(expected, solution.longestCommonSubsequence(t1,t2));
    }

    private static Stream<Arguments> parametry() {
        return Stream.of(
                Arguments.of("abcde", "ace", 3),
                Arguments.of("abc","abc",3),
                Arguments.of("abc","def",0)
        );
    }

}