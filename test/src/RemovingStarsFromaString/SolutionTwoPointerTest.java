package RemovingStarsFromaString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTwoPointerTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of("leet**cod*e","lecoe"),
                Arguments.of("erase*****",""));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(String s, String expected) {
        SolutionTwoPointer solution=new SolutionTwoPointer();
        assertEquals(expected, solution.removeStars(s));
    }

}