package IncreasingTripletSubsequence;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertTrue(solution.increasingTriplet(new int[]{1,2,3,4,5}));
    }

    @Test
    void test2() {
        Solution solution=new Solution();
        assertFalse(solution.increasingTriplet(new int[]{5,4,3,2,1}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertTrue(solution.increasingTriplet(new int[]{2,1,5,0,4,6}));
    }

}