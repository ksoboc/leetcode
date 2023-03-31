package NumberofWaysofCuttingaPizza;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionMemoryOptimizedTest {

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(3,3,new String[]{"A..","AAA","..."}),
                Arguments.of(1,3,new String[]{"A..","AA.","..."}),
                Arguments.of(1,1,new String[]{"A..","A..","..."}));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int expected, int k, String[] pizza) {
        SolutionMemOptimized solution=new SolutionMemOptimized();

        assertEquals(expected,solution.ways(pizza,k));
    }

}