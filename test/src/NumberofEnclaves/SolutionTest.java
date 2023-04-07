package NumberofEnclaves;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(Arguments.of(new int[][]{{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}},3),
                Arguments.of(new int[][]{{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}},0));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[][] grid, int expected) {
        Solution solution=new Solution();
        assertEquals(expected,solution.numEnclaves(grid));
    }

}