package MaximumRunningTimeofNComputers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionAltTest {
    @Test
    void test1() {
        SolutionAlt solution=new SolutionAlt();
        var res = solution.maxRunTime(2,new int[]{3,3,3});
        assertEquals(4,res);
    }
    @Test
    void test2() {
        SolutionAlt solution=new SolutionAlt();
        var res = solution.maxRunTime(2,new int[]{1,1,1,1});
        assertEquals(2,res);
    }
    //
    @Test
    void test3() {
        SolutionAlt solution=new SolutionAlt();
        var res = solution.maxRunTime(3,new int[]{10,10,3,5});
        assertEquals(8,res);
    }

}