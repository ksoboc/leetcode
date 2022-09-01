package BoatstoSavePeople;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();
    @Test
    void test() {
        assertEquals(1, solution.numRescueBoats(new int[]{1,2},3));
    }

    @Test
    void test2() {
        assertEquals(3, solution.numRescueBoats(new int[]{3,2,2,1},3));
    }

    @Test
    void test4() {
        assertEquals(4, solution.numRescueBoats(new int[]{3,5,3,4},5));
    }

}