package NumberofWaystoStayintheSamePlaceAfterSomeSteps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.numWays(3,2);
        assertEquals(4,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.numWays(2,4);
        assertEquals(2,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.numWays(4,2);
        assertEquals(8,res);
    }

}