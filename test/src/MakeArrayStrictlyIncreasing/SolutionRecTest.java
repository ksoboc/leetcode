package MakeArrayStrictlyIncreasing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionRecTest {
    @Test
    void test1() {
        SolutionRec solution=new SolutionRec();
        var res = solution.makeArrayIncreasing(new int[]{1,5,3,6,7}, new int[]{1,3,2,4});
        assertEquals(1,res);

    }
    @Test
    void test2() {
        SolutionRec solution=new SolutionRec();
        var res = solution.makeArrayIncreasing(new int[]{1,5,3,6,7}, new int[]{4,3,1});
        assertEquals(2,res);

    }
    @Test
    void test3() {
        SolutionRec solution=new SolutionRec();
        var res = solution.makeArrayIncreasing(new int[]{1,5,3,6,7}, new int[]{1,6,3,3});
        assertEquals(-1,res);

    }
    @Test
    void test4() {
        SolutionRec solution=new SolutionRec();
        var res = solution.makeArrayIncreasing(new int[]{0,11,6,1,4,3}, new int[]{5,4,11,10,1,0});
        assertEquals(5,res);
    }

}