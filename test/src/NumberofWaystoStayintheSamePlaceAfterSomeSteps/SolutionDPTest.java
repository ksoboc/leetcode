package NumberofWaystoStayintheSamePlaceAfterSomeSteps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        var res = solution.numWays(3,2);
        assertEquals(4,res);
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        var res = solution.numWays(2,4);
        assertEquals(2,res);
    }
    @Test
    void test3() {
        SolutionDP solution=new SolutionDP();
        var res = solution.numWays(4,2);
        assertEquals(8,res);
    }

}