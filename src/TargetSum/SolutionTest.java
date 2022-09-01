package TargetSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(5,solution.findTargetSumWays(new int[]{1,1,1,1,1},3));
    }

    @Test
    void test2() {
        assertEquals(1,solution.findTargetSumWays(new int[]{1},1));
    }

}