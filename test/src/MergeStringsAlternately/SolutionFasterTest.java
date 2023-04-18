package MergeStringsAlternately;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionFasterTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of("abc","pqr","apbqcr"),
                Arguments.of("ab","pqrs","apbqrs"),
                Arguments.of("abcd","pq","apbqcd"));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(String word1, String word2, String expected) {
        SolutionFaster solution=new SolutionFaster();
        assertEquals(expected, solution.mergeAlternately(word1, word2));
    }

}