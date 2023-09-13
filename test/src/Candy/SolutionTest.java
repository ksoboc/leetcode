package Candy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.candy(new int[]{1,0,2});
        assertEquals(5,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.candy(new int[]{1,2,2});
        assertEquals(4,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.candy(new int[]{1,3,2,1});
        assertEquals(7,res);
    }

}