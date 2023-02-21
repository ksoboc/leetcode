package BestTeamWithNoConflicts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        assertEquals(34, solution.bestTeamScore(new int[]{1,3,5,10,15},new int[]{1,2,3,4,5}));
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        assertEquals(16, solution.bestTeamScore(new int[]{4,5,6,5},new int[]{2,1,2,1}));
    }
    @Test
    void test3() {
        SolutionDP solution=new SolutionDP();
        assertEquals(6, solution.bestTeamScore(new int[]{1,2,3,5},new int[]{8,9,10,1}));
    }

}