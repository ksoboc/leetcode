package IntegerBreak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.integerBreak(2);
        assertEquals(1,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.integerBreak(10);
        assertEquals(36,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.integerBreak(3);
        assertEquals(2,res);
    }

}