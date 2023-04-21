package ProfitableSchemes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of(5,3,new int[]{2,2},new int[]{2,3},2),
                Arguments.of(10,5,new int[]{2,3,5},new int[]{6,7,8},7));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int n, int minProfit, int[] group, int[] profit, int expected) {
        SolutionDP solution=new SolutionDP();
        assertEquals(expected, solution.profitableSchemes(n,minProfit,group,profit));
    }

}