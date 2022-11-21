package NumberofDiceRollsWithTargetSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(1,solution.numRollsToTarget(1,6,3));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(6,solution.numRollsToTarget(2,6,7));
    }

    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(222616187,solution.numRollsToTarget(30,30,500));
    }
}