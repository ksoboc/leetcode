package SimilarStringGroups;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionUFTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of(new String[]{"tars", "rats", "arts", "star"}, 2),
                Arguments.of(new String[]{"omv", "ovm"}, 1));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(String[] strs, int expected) {
        SolutionUF solution = new SolutionUF();
        assertEquals(expected, solution.numSimilarGroups(strs));
    }

}