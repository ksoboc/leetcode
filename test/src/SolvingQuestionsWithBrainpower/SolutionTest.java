package SolvingQuestionsWithBrainpower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(5, solution.mostPoints(new int[][]{{3,2},{4,3},{4,4},{2,5}}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(7, solution.mostPoints(new int[][]{{1,1},{2,2},{3,3},{4,4},{5,5}}));
    }

}