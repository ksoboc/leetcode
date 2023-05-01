package AverageSalaryExcludingtheMinimumandMaximumSalary;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of(new int[]{4000,3000,1000,2000},2500D),
                Arguments.of(new int[]{1000,2000,3000},2000D));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] salary, double expected) {
        Solution solution=new Solution();
        assertEquals(expected,solution.average(salary),1E-5);
    }

}