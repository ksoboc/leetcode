package RansomNote;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("params")
    void test(String ransomNote,String magazine, boolean expected) {
        Solution solution=new Solution();
        assertEquals(expected,solution.canConstruct(ransomNote,magazine));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of("a","b",false),
                Arguments.of("aa","ab",false),
                Arguments.of("aa","aab",true)
        );
    }

}