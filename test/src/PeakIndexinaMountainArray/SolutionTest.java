package PeakIndexinaMountainArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res=solution.peakIndexInMountainArray(new int[]{0,1,0});
        assertEquals(1,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res=solution.peakIndexInMountainArray(new int[]{0,2,1,0});
        assertEquals(1,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res=solution.peakIndexInMountainArray(new int[]{0,10,5,2});
        assertEquals(1,res);
    }

}