package AsteroidCollision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        assertArrayEquals(new int[]{5,10}, solution.asteroidCollision(new int[]{5,10,-5}));
    }

    @Test
    void test2() {
        assertArrayEquals(new int[]{}, solution.asteroidCollision(new int[]{8,-8}));
    }
    @Test
    void test3() {
        assertArrayEquals(new int[]{10}, solution.asteroidCollision(new int[]{10,2,-5}));
    }

}