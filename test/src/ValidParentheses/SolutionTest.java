package ValidParentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of("()", true),
                Arguments.of("()[]{}",true),
                Arguments.of("(]",false));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(String input, boolean expected) {
        Solution solution=new Solution();
        assertEquals(expected, solution.isValid(input));
    }

}