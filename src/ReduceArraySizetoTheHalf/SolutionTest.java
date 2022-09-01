package ReduceArraySizetoTheHalf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(2, solution.minSetSize(new int[]{3,3,3,3,5,5,5,2,2,7}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(1, solution.minSetSize(new int[]{7,7,7,7,7,7}));
    }


    @Test
    void test3() {
        Solution solution=new Solution();

        assertEquals(5, solution.minSetSize(new int[]{9,77,63,22,92,9,14,54,8,38,18,19,38,68,58,19}));
    }
}