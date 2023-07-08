package PutMarblesinBags;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.putMarbles(new int[]{1,3,5,1},2);
        System.out.println("res = " + res);
        assertEquals(res,4);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.putMarbles(new int[]{1, 3},2);
        System.out.println("res = " + res);
        assertEquals(res,0);
    }

}