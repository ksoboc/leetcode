package ReorderedPowerOf2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("params")
    void test(int n, boolean expected) {
        Solution solution=new Solution();
        assertEquals(expected,solution.reorderedPowerOf2(n));
    }

    static Stream<Arguments> params() {
        return Stream.of(Arguments.of(1,true),
                Arguments.of(10,false),
                Arguments.of(46,true));
    }
}