package CountNegativeNumbersinaSortedMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(8, solution.countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(0, solution.countNegatives(new int[][]{{3,2},{1,0}}));
    }

}