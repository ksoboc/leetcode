package MinimumCostForTickets;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(int[] days, int[] costs, int expected) {
        assertEquals(expected,solution.mincostTickets(days,costs));

    }

    @ParameterizedTest
    @MethodSource("params")
    void testRec(int[] days, int[] costs, int expected) {
        assertEquals(expected,solution.mincostTicketsRecursive(days,costs));

    }

    private static Stream<Arguments> params() {
        return Stream.of(Arguments.of(new int[]{1,4,6,7,8,20},new int[]{2,7,15},11),
                Arguments.of(new int[]{1,2,3,4,5,6,7,8,9,10,30,31},new int[]{2,7,15},17));
    }

}