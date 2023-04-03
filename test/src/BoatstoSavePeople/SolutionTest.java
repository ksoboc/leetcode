package BoatstoSavePeople;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of(new int[]{3,2,2,1},3,3),
                Arguments.of(new int[]{1,2},3,1),
                Arguments.of(new int[]{3,5,3,4},5,4)
                );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] people, int limit, int expected) {
        Solution solution=new Solution();
        assertEquals(expected, solution.numRescueBoats(people,limit));
    }

}