package MedianofTwoSortedArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.findMedianSortedArrays(new int[]{1,3},new int[]{2});
        assertEquals(2.0,res,1e-5);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.findMedianSortedArrays(new int[]{1,2},new int[]{3,4});
        assertEquals(2.5,res,1e-5);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.findMedianSortedArrays(new int[]{},new int[]{1});
        assertEquals(1.0,res,1e-5);
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        var res = solution.findMedianSortedArrays(new int[]{1,2,3,4,5},new int[]{});
        assertEquals(3.0,res,1e-5);
    }
    @Test
    void test5() {
        Solution solution=new Solution();
        var res = solution.findMedianSortedArrays(new int[]{100001},new int[]{100000});
        assertEquals(100000.5,res,1e-5);
    }

}