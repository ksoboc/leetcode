package ChampagneTower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.champagneTower(1,1,1);
        System.out.println("res = " + res);
        assertEquals(0.0,res,1e-5);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.champagneTower(2,1,1);
        System.out.println("res = " + res);
        assertEquals(0.5,res,1e-5);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.champagneTower(100000009,33,17);
        System.out.println("res = " + res);
        assertEquals(1.0,res,1e-5);
    }

}