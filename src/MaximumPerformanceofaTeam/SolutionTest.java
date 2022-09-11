package MaximumPerformanceofaTeam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(60, solution.maxPerformance(6, new int[]{2,10,3,1,5,8},new int[]{5,4,3,9,7,2},2));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(68, solution.maxPerformance(6, new int[]{2,10,3,1,5,8},new int[]{5,4,3,9,7,2},3));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(72, solution.maxPerformance(6, new int[]{2,10,3,1,5,8},new int[]{5,4,3,9,7,2},4));
    }

}