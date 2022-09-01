package PlusOne;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        var res = solution.plusOne(new int[]{1,2,3});
        System.out.println("res = " + Arrays.toString(res));
        assertArrayEquals(new int[]{1, 2, 4},res);
    }
    @Test
    void test3() {
        var res = solution.plusOne(new int[]{9});
        System.out.println("res = " + Arrays.toString(res));
        assertArrayEquals(new int[]{1,0},res);
    }

}