package KInversePairsArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test1() {
        assertEquals(1,solution.kInversePairs(3,0));
    }

    @Test
    void test2() {
        assertEquals(2, solution.kInversePairs(3,1));
    }

}