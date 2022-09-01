package SquaresofaSortedArray;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution=new Solution();
    @Test
    void test() {
        var res = solution.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        List<Integer> list = IntStream.of(res).boxed().collect(Collectors.toList());
        System.out.println(list );
    }

}