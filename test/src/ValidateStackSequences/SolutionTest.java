package ValidateStackSequences;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of(new int[]{1,2,3,4,5},new int[]{4,5,3,2,1},true),
                Arguments.of(new int[]{1,2,3,4,5},new int[]{4,3,5,1,2},false));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] pushed,int[] popped,boolean expected) {
        Solution solution=new Solution();
        assertEquals(expected, solution.validateStackSequences(pushed, popped));
    }


}