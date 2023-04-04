package OptimalPartitionofString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of("abacaba",4),
                Arguments.of("ssssss",6));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(String s, int expected) {
        Solution solution=new Solution();
        assertEquals(expected, solution.partitionString(s));
    }

}