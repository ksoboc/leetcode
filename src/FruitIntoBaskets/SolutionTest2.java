package FruitIntoBaskets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest2 {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(3,solution.totalFruit2(new int[]{1,2,1}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(3,solution.totalFruit2(new int[]{0,1,2,2}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(4,solution.totalFruit2(new int[]{1,2,1,3,2,2}));
    }

}