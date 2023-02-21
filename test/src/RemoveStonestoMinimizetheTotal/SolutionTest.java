package RemoveStonestoMinimizetheTotal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(12,solution.minStoneSum(new int[]{5,4,9},2));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(12,solution.minStoneSum(new int[]{4,3,6,7},3));
    }

}