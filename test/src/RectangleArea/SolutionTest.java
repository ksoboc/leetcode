package RectangleArea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.computeArea(-3,0,3,4,0,-1,9,2);
        System.out.println("res = " + res);
        assertEquals(45,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.computeArea(-2,-2,2,2,-2,-2,2,2);
        System.out.println("res = " + res);
        assertEquals(16,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.computeArea(-2,-2,2,2,3,3,4,4);
        System.out.println("res = " + res);
        assertEquals(17,res);
    }

}