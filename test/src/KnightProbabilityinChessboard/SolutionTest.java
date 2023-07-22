package KnightProbabilityinChessboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.knightProbability(3,2,0,0);
        System.out.println("res = " + res);
        assertEquals(0.0625,res,0.0001);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.knightProbability(1,0,0,0);
        System.out.println("res = " + res);
        assertEquals(1.0,res,0.00001);
    }

}