package AsteroidCollision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] asteroids = {5,10,-5};
        var res=solution.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{5,10},res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] asteroids = {8,-8};
        var res=solution.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{},res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[] asteroids = {10,2,-5};
        var res=solution.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{10},res);
    }
    //
    @Test
    void test4() {
        Solution solution=new Solution();
        int[] asteroids = {1,-1,1,-2};
        var res=solution.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{-2},res);
    }
    //
    @Test
    void test5() {
        Solution solution=new Solution();
        int[] asteroids = {2,-1,1,-2};
        var res=solution.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{},res);
    }

}