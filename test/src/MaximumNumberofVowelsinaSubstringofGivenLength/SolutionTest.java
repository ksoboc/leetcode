package MaximumNumberofVowelsinaSubstringofGivenLength;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of("abciiidef",3,3),
                Arguments.of("aeiou",2,2),
                Arguments.of("leetcode",3,2));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(String s, int k, int expected) {
        Solution solution=new Solution();
        assertEquals(expected, solution.maxVowels(s,k));
    }

}