package NumberofDiceRollsWithTargetSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTestDP {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(1,solution.numRollsToTargetDP(1,6,3));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(6,solution.numRollsToTargetDP(2,6,7));
    }

    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(222616187,solution.numRollsToTargetDP(30,30,500));
    }
}