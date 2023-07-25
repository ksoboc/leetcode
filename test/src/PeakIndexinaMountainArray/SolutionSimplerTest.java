package PeakIndexinaMountainArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionSimplerTest {
    @Test
    void test1() {
        SolutionSimpler solution=new SolutionSimpler();
        var res=solution.peakIndexInMountainArray(new int[]{0,1,0});
        assertEquals(1,res);
    }
    @Test
    void test2() {
        SolutionSimpler solution=new SolutionSimpler();
        var res=solution.peakIndexInMountainArray(new int[]{0,2,1,0});
        assertEquals(1,res);
    }
    @Test
    void test3() {
        SolutionSimpler solution=new SolutionSimpler();
        var res=solution.peakIndexInMountainArray(new int[]{0,10,5,2});
        assertEquals(1,res);
    }

}