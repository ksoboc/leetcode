package NumberofWaystoFormaTargetStringGivenaDictionary;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new String[]{"acca","bbbb","caca"},"aba",6),
                Arguments.of(new String[]{"abba","baab"},"bab",4));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(String[] words, String target, int expected) {
        Solution solution=new Solution();
        assertEquals(expected, solution.numWays(words,target));
    }

}