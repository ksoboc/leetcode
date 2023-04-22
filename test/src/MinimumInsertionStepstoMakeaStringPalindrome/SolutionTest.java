package MinimumInsertionStepstoMakeaStringPalindrome;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of("zzazz",0),
                Arguments.of("mbadm",2),
                Arguments.of("leetcode",5));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(String s, int expected) {
        Solution solution=new Solution();
        assertEquals(expected,solution.minInsertions(s));
    }

}