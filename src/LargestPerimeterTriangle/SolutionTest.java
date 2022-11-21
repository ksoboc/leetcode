package LargestPerimeterTriangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(5,solution.largestPerimeter(new int[]{2,1,2}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(0,solution.largestPerimeter(new int[]{1,2,1}));
    }
    //1,2,2,4,18,8
    @Test
    void test3() {
        Solution solution=new Solution();

        assertEquals(11,solution.largestPerimeter(new int[]{3,4,15,2,9,4}));
    }

}