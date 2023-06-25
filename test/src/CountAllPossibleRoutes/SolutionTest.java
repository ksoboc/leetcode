package CountAllPossibleRoutes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res=solution.countRoutes(new int[]{2,3,6,8,4},1,3,5);
        System.out.println("res = " + res);
        assertEquals(4,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res=solution.countRoutes(new int[]{4,3,1},1,0,6);
        System.out.println("res = " + res);
        assertEquals(5,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res=solution.countRoutes(new int[]{5,2,1},0,2,3);
        System.out.println("res = " + res);
        assertEquals(0,res);
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        var res=solution.countRoutes(new int[]{2,1,5},0,0,3);
        System.out.println("res = " + res);
        assertEquals(2,res);
    }

}