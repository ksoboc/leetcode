package UncrossedLines;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();

        assertEquals(2,solution.maxUncrossedLines(new int[]{1,4,2}, new int[]{1,2,4}));
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();

        assertEquals(3,solution.maxUncrossedLines(new int[]{2,5,1,2,5}, new int[]{10,5,2,1,5,2}));
    }
    @Test
    void test3() {
        SolutionDP solution=new SolutionDP();

        assertEquals(2,solution.maxUncrossedLines(new int[]{1,3,7,1,7,5}, new int[]{1,9,2,5,1}));
    }

}