package CountingBits;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var ans = solution.countBits(2);
        assertArrayEquals(new int[]{0,1,1},ans);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var ans = solution.countBits(5);
        assertArrayEquals(new int[]{0,1,1,2,1,2},ans);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var ans = solution.countBits(30);
        System.out.println("Arrays.toString(ans) = " + Arrays.toString(ans));
    }

}