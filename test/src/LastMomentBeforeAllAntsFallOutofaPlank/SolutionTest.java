package LastMomentBeforeAllAntsFallOutofaPlank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] left = {4,3};
        int[] right = {0,1};
        int n=4;
        var res = solution.getLastMoment(n,left,right);
        assertEquals(4,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] left = {};
        int[] right = {0,1,2,3,4,5,6,7};
        int n=7;
        var res = solution.getLastMoment(n,left,right);
        assertEquals(7,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[] left = {0,1,2,3,4,5,6,7};
        int[] right = {};
        int n=7;
        var res = solution.getLastMoment(n,left,right);
        assertEquals(7,res);
    }

}