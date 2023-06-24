package TallestBillboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.tallestBillboard(new int[]{1,2,3,6});
        assertEquals(6,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.tallestBillboard(new int[]{1,2,3,4,5,6});
        assertEquals(10,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.tallestBillboard(new int[]{1,2});
        assertEquals(0,res);
    }


    @Test
    void test7() {
        Solution solution=new Solution();
        var res = solution.tallestBillboard(new int[]{1,2,4,8,16,32,64,128,256,512,50,50,50,150,150,150,100,100,100,123});
        assertEquals(1023,res);
    }

}