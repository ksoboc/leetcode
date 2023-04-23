package RestoreTheArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of("1000", 10_000,1),
                Arguments.of("1000",10,0),
                Arguments.of("1317", 2000, 8));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(String s, int k, int expected) {
        SolutionDP solution=new SolutionDP();
        assertEquals(expected, solution.numberOfArrays(s,k));
    }



}