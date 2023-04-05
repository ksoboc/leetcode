package MinimizeMaximumofArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(5,solution.minimizeArrayValue(new int[]{3,7,1,6}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(10,solution.minimizeArrayValue(new int[]{10,1}));
    }
    //13,13,20,0,8,9,9
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(16,solution.minimizeArrayValue(new int[]{13,13,20,0,8,9,9}));
    }
}