package PathwithMaximumProbability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(0.25,
                solution.maxProbability(3, new int[][]{{0,1},{1,2},{0,2}},new double[]{0.5,0.5,0.2},0,2),
                1e-5);
    }

    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(0.3,
                solution.maxProbability(3, new int[][]{{0,1},{1,2},{0,2}},new double[]{0.5,0.5,0.3},0,2),
                1e-5);
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        assertEquals(0.0,
                solution.maxProbability(3, new int[][]{{0,1}},new double[]{0.5},0,2),
                1e-5);
    }

}