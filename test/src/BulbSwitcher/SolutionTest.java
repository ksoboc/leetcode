package BulbSwitcher;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of(3,1),
                Arguments.of(0,0),
                Arguments.of(1,1));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int n, int expected) {
        Solution solution=new Solution();
        assertEquals(expected, solution.bulbSwitch(n));
    }

}