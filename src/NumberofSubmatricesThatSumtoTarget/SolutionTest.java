package NumberofSubmatricesThatSumtoTarget;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        assertEquals(4, solution.numSubmatrixSumTarget(new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 1, 0}}, 0));
    }

    @Test
    void test2() {
        assertEquals(5, solution.numSubmatrixSumTarget(new int[][]{{1,-1},{-1,1}},0));
    }

    @Test
    void test3() {
        assertEquals(0, solution.numSubmatrixSumTarget(new int[][]{{904}},0));
    }

    @Test
    void timeTest() {
        int res = 0;
        long startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            res = solution.numSubmatrixSumTarget(new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 1, 0}}, 0);
        }
        long elapsed = System.nanoTime() - startTime;
        System.out.println("Time in sec=" + (double)elapsed / 1_000_000_000 + ", res=" + res);
    }

}