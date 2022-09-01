package MergeIntervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        solution.merge(new int[][]{{1,4},{0,2},{3,5}});
    }
}