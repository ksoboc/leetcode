package SpecialPositionsinaBinaryMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] mat ={{1,0,0},{0,0,1},{1,0,0}};
        var res = solution.numSpecial(mat);
        assertEquals(1,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] mat ={{1,0,0},{0,1,0},{0,0,1}};
        var res = solution.numSpecial(mat);
        assertEquals(3,res);
    }

}