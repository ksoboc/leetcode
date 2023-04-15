package MaximumValueofKCoinsFromPiles;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of(List.of(List.of(1,100,3),List.of(7,8,9)),2,101),
                Arguments.of(List.of(List.of(100),List.of(100),List.of(100),List.of(100),List.of(100),List.of(100),List.of(1,1,1,1,1,1,700)),7,706));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(List<List<Integer>> piles, int k, int expected) {
        Solution solution=new Solution();
        assertEquals(expected, solution.maxValueOfCoins(piles,k));
    }

}