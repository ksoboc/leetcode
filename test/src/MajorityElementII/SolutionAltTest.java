package MajorityElementII;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionAltTest {
    @Test
    void test1() {
        SolutionAlt solution = new SolutionAlt();
        var res = solution.majorityElement(new int[]{3,2,3});
        assertEquals(List.of(3),res);
    }
    @Test
    void test2() {
        SolutionAlt solution = new SolutionAlt();
        var res = solution.majorityElement(new int[]{1});
        assertEquals(List.of(1),res);
    }
    @Test
    void test3() {
        SolutionAlt solution = new SolutionAlt();
        var res = solution.majorityElement(new int[]{1,2});
        assertEquals(List.of(1,2),res);
    }
    @Test
    void test4() {
        SolutionAlt solution = new SolutionAlt();
        var res = solution.majorityElement(new int[]{2,2});
        assertEquals(List.of(2),res);
    }
    @Test
    void test5() {
        SolutionAlt solution = new SolutionAlt();
        var res = solution.majorityElement(new int[]{0,3,4,0});
        assertEquals(List.of(0),res);
    }
    //
    @Test
    void test6() {
        SolutionAlt solution = new SolutionAlt();
        var res = solution.majorityElement(new int[]{1,3,3,2,2,4,3,3,5,5,6,3,3,7,7});
        assertEquals(List.of(3),res);
    }


}