package NQueensII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(int n, int expected) {
        assertEquals(expected,solution.totalNQueens(n));
    }

    private static Stream<Arguments> params() {
        return Stream.of(Arguments.of(4,2),
                Arguments.of(1,1));
    }

}