package PalindromePartitioning;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    private SolutionDP solution = new SolutionDP();


    @ParameterizedTest
    @MethodSource("arguments")
    void test(String s, int expected) {
        var res = solution.partition(s);

        System.out.println("res = " + res);
        assertEquals(expected, res.size());

    }

    private static Stream<Arguments> arguments() {
        return Stream.of(Arguments.of("aab",2),
                Arguments.of("a",1));

    }


}