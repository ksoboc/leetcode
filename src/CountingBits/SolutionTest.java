package CountingBits;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        var res = solution.countBits2(2);
        System.out.println("res = " + Arrays.toString(res));
        assertArrayEquals(new int[]{0,1,1},res);
    }

    @Test
    void test2() {
        var res = solution.countBits2(5);
        System.out.println("res = " + Arrays.toString(res));
        assertArrayEquals(new int[]{0,1,1,2,1,2},res);
    }
}