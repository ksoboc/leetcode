package IntegerBreak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionAltTest {
    @Test
    void test1() {
        SolutionAlt solution = new SolutionAlt();
        var res=solution.integerBreak(10);
        assertEquals(36,res);
    }
    @Test
    void test2() {
        SolutionAlt solution = new SolutionAlt();
        var res=solution.integerBreak(20);
        assertEquals(1458,res);
    }

}