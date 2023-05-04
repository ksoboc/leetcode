package Dota2Senate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of("RD","Radiant"),
                Arguments.of("RDD","Dire"));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(String senate, String expected) {
        Solution solution=new Solution();
        assertEquals(expected, solution.predictPartyVictory(senate));
    }

}