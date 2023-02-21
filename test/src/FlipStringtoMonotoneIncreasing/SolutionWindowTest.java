package FlipStringtoMonotoneIncreasing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionWindowTest {
    @Test
    void test1() {
        SolutionWindow solution=new SolutionWindow();

        assertEquals(1,solution.minFlipsMonoIncr("00110"));
    }
    @Test
    void test2() {
        SolutionWindow solution=new SolutionWindow();

        assertEquals(2,solution.minFlipsMonoIncr("010110"));
    }
    @Test
    void test3() {
        SolutionWindow solution=new SolutionWindow();

        assertEquals(2,solution.minFlipsMonoIncr("00011000"));
    }


}