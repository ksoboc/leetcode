package TheKWeakestRowsinaMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] mat={{1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}};
        var res = solution.kWeakestRows(mat,3);
        assertArrayEquals(new int[]{2,0,3},res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] mat={{1,0,0,0},
                {1,1,1,1},
                {1,0,0,0},
                {1,0,0,0}};
        var res = solution.kWeakestRows(mat,2);
        assertArrayEquals(new int[]{0,2},res);
    }

}