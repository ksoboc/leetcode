package FlipStringtoMonotoneIncreasing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(1,solution.minFlipsMonoIncr("00110"));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(2,solution.minFlipsMonoIncr("010110"));
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        assertEquals(2,solution.minFlipsMonoIncr("00011000"));
    }

}