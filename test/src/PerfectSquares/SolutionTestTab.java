package PerfectSquares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTestTab {
    @Test
    void test1() {
        SolutionTab solution=new SolutionTab();
        assertEquals(3,solution.numSquares(12));
    }
    @Test
    void test2() {
        SolutionTab solution=new SolutionTab();
        assertEquals(2,solution.numSquares(13));
    }

}