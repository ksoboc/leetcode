package CountNegativeNumbersinaSortedMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionLTTest {
    @Test
    void test1() {
        SolutionLT solution=new SolutionLT();

        assertEquals(8, solution.countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
    }
    @Test
    void test2() {
        SolutionLT solution=new SolutionLT();

        assertEquals(0, solution.countNegatives(new int[][]{{3,2},{1,0}}));
    }

}