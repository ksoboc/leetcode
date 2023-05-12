package SolvingQuestionsWithBrainpower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        assertEquals(5, solution.mostPoints(new int[][]{{3,2},{4,3},{4,4},{2,5}}));
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        assertEquals(7, solution.mostPoints(new int[][]{{1,1},{2,2},{3,3},{4,4},{5,5}}));
    }

}