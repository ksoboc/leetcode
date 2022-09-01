package LastStoneWeight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(1,solution.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }

    @Test
    void test2() {
        assertEquals(1,solution.lastStoneWeight(new int[]{1}));
    }

    @Test
    void test3() {
        assertEquals(0,solution.lastStoneWeight(new int[]{1,1}));
    }

}