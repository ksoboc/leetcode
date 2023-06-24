package TallestBillboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionStatesTest {
    @Test
    void test1() {
        SolutionStates solution=new SolutionStates();
        var res = solution.tallestBillboard(new int[]{1,2,3,6});
        assertEquals(6,res);
    }
    @Test
    void test2() {
        SolutionStates solution=new SolutionStates();
        var res = solution.tallestBillboard(new int[]{1,2,3,4,5,6});
        assertEquals(10,res);
    }
    @Test
    void test3() {
        SolutionStates solution=new SolutionStates();
        var res = solution.tallestBillboard(new int[]{1,2});
        assertEquals(0,res);
    }

}