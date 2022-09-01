package InterleavingString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(String s1, String s2, String s3, boolean expected) {
        assertEquals(expected, solution.isInterleave(s1,s2,s3));
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of("aabcc",  "dbbca", "aadbbcbcac",true),
                Arguments.of( "aabcc",  "dbbca", "aadbbbaccc",false),
                Arguments.of("","","",true));
    }

}