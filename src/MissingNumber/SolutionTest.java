package MissingNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(2, solution.missingNumberSum(new int[]{3,0,1}));
    }

    @Test
    void test2() {
        assertEquals(2, solution.missingNumberSum(new int[]{0,1}));
    }

    @Test
    void test3() {
        assertEquals(8, solution.missingNumberSum(new int[]{9,6,4,2,3,5,7,0,1}));
    }

}