package MinimumDominoRotationsforEqualRow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test1() {
        int[] tops = {2,1,2,4,2,2};
        int[] bottoms = {5,2,6,2,3,2};

        assertEquals(2,solution.minDominoRotations(tops,bottoms));
    }
    @Test
    void test2() {
        int[] tops = {3,5,1,2,3};
        int[] bottoms = {3,6,3,3,4};

        assertEquals(-1,solution.minDominoRotations(tops,bottoms));
    }

}