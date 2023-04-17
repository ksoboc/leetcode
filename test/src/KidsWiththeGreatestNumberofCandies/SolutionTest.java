package KidsWiththeGreatestNumberofCandies;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{2,3,5,1,3},3,new Boolean[]{true,true,true,false,true}),
                Arguments.of(new int[]{4,2,1,1,2},1,new Boolean[]{true,false,false,false,false}),
                Arguments.of(new int[]{12,1,12},10,new Boolean[]{true,false,true}));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] candies, int extraCandies,Boolean[] expected) {
        Solution solution=new Solution();
        var res = solution.kidsWithCandies(candies, extraCandies);
        assertArrayEquals(expected, res.toArray(new Boolean[0]));
    }

}