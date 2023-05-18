package MinimumNumberofVerticestoReachAllNodes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(5,List.of(List.of(0,1),
                                List.of(2,1),
                                List.of(3,1),
                                List.of(1,4),
                                List.of(2,4)),
                        List.of(0,2,3)),
                Arguments.of(6,List.of(List.of(0,1),
                        List.of(0,2),
                        List.of(2,5),
                        List.of(3,4),
                        List.of(4,2)),
                List.of(0,3))
               );

    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int n, List<List<Integer>> edges, List<Integer> expected) {
        Solution solution=new Solution();
        assertEquals(expected, solution.findSmallestSetOfVertices(n,edges));
    }

}