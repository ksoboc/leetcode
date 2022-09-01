package KokoEatingBananas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void prep() {
        solution=new Solution();
    }
    @Test
    void test1() {
        int[] piles = {3,6,7,11};
        var h = 8;
        assertEquals(4,solution.minEatingSpeed(piles,h));

    }

    @Test
    void test2() {
        int[] piles = {30,11,23,4,20};
        var h = 5;
        assertEquals(30,solution.minEatingSpeed(piles,h));

    }

    @Test
    void test3() {
        int[] piles = {30,11,23,4,20};
        var h = 6;
        assertEquals(23,solution.minEatingSpeed(piles,h));

    }

}