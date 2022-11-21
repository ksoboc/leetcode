package MostStonesRemovedwithSameRoworColumn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        var solution = new Solution();

        assertEquals(5,solution.removeStones(new int[][]{{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}}));

    }
    @Test
    void test2() {
        var solution = new Solution();

        assertEquals(3,solution.removeStones(new int[][]{{0,0},{0,2},{1,1},{2,0},{2,2}}));

    }
    @Test
    void test3() {
        var solution = new Solution();

        assertEquals(0,solution.removeStones(new int[][]{{0,0}}));

    }

}