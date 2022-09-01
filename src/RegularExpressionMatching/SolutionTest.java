package RegularExpressionMatching;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @ParameterizedTest
    @MethodSource("arguments")
    void test(String input, String pattern, boolean expected) {
        assertEquals(expected, solution.isMatch(input,pattern));
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void testBU(String input, String pattern, boolean expected) {
        assertEquals(expected, solution.isMatchBU(input,pattern));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("aaa","a*a",true),
                Arguments.of("aa","a",false),
                Arguments.of("aa","a*",true),
                Arguments.of("ab",".*",true));

    }

}