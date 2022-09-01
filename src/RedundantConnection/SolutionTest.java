package RedundantConnection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        var res = solution.findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}});
        assertArrayEquals(new int[]{2, 3}, res);
    }

    @Test
    void test2() {
        var res = solution.findRedundantConnection(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}});
        assertArrayEquals(new int[]{1, 4}, res);
    }

}