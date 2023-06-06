package CanMakeArithmeticProgressionFromSequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertTrue(solution.canMakeArithmeticProgression(new int[]{3,5,1}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertFalse(solution.canMakeArithmeticProgression(new int[]{1,2,4}));
    }

}