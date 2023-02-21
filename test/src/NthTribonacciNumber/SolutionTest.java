package NthTribonacciNumber;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest()
    @MethodSource("arguments")
    void test(int n, int res) {
        Solution solution=new Solution();
        int x = solution.tribonacci(n);
        assertEquals(res, x);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(Arguments.of(4,4),
                Arguments.of(25,1389537));
    }
}