package PossibleBipartition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUFTest {
    @Test
    void test1() {
        SolutionUF solution=new SolutionUF();

        var res = solution.possibleBipartition(4, new int[][]{{1,2},{1,3},{2,4}});
        assertTrue(res);
    }
    @Test
    void test2() {
        SolutionUF solution=new SolutionUF();

        var res = solution.possibleBipartition(3, new int[][]{{1,2},{1,3},{2,3}});
        assertFalse(res);
    }
}