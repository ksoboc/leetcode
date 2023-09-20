package MinimumOperationstoReduceXtoZero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.minOperations(new int[]{1,1,4,2,3},5);
        assertEquals(2,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.minOperations(new int[]{5,6,7,8,9},4);
        assertEquals(-1,res);
    }
    //
    @Test
    void test4() {
        Solution solution=new Solution();
        var res = solution.minOperations(new int[]{5,2,3,1,1},5);
        assertEquals(1,res);
    }

}