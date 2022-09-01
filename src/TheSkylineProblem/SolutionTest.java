package TheSkylineProblem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        var res = solution.getSkyline(new int[][]{{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}});
        System.out.println("res = " + res);
    }

    @Test
    void test2() {
        var res = solution.getSkyline(new int[][]{{0, 2, 3}, {2, 5, 3}});
        System.out.println("res = " + res);
    }

    @Test
    void test3() {
        var res = solution.getSkyline(new int[][]{{0, 2, 1}, {0, 2, 2}, {0, 2, 3}});
        System.out.println("res = " + res);
    }

}