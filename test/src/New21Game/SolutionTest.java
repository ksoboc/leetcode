package New21Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.new21Game(10,1,10);
        assertEquals(1.0,res,1e-5);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.new21Game(6,1,10);
        assertEquals(0.6,res,1e-5);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.new21Game(21,17,10);
        assertEquals(0.73278,res,1e-5);
    }

}