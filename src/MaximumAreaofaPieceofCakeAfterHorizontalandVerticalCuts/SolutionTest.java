package MaximumAreaofaPieceofCakeAfterHorizontalandVerticalCuts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(4, solution.maxArea(5,4,new int[]{1,2,4},new int[]{1,3}));
    }
    @Test
    void test2() {
        assertEquals(6, solution.maxArea(5,4,new int[]{3,1},new int[]{1}));
    }

}