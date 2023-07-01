package FairDistributionofCookies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] cookies={8,15,10,20,8};
        var res = solution.distributeCookies(cookies,2);
        System.out.println("res = " + res);
        assertEquals(31,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] cookies={6,1,3,2,2,4,1,2};
        var res = solution.distributeCookies(cookies,3);
        System.out.println("res = " + res);
        assertEquals(7,res);
    }

}