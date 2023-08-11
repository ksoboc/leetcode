package CoinChangeII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] coins = {1,2,5};
        var res = solution.change(5,coins);
        assertEquals(4,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] coins = {2};
        var res = solution.change(3,coins);
        assertEquals(0,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[] coins = {10};
        var res = solution.change(10,coins);
        assertEquals(1,res);
    }

}