package MaximumBagswithFullCapacityofRocks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(3,solution.maximumBags(new int[]{2,3,4,5},new int[]{1,2,4,4},2));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(3,solution.maximumBags(new int[]{10,2,2},new int[]{2,2,0},100));
    }

}