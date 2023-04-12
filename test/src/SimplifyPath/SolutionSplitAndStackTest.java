package SimplifyPath;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionSplitAndStackTest {
    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("/a//b////c/d//././/..","/a/b/c"),
                Arguments.of("/../", "/"),
                Arguments.of("/home//foo/", "/home/foo"),
                Arguments.of("/a/./b/../../c/", "/c"),
                Arguments.of("/home/", "/home"));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(String path, String expected) {
        SolutionSplitAndStack solution = new SolutionSplitAndStack();
        assertEquals(expected, solution.simplifyPath(path));
    }

}