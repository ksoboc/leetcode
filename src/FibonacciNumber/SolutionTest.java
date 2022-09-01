package FibonacciNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("params")
    void test(int n, int expected) {
        Solution solution=new Solution();
        assertEquals(expected, solution.fib(n));
    }

    static private Stream<Arguments> params() {
        return Stream.of(Arguments.of(2,1),
                Arguments.of(3,2),
                Arguments.of(4,3));
    }

}