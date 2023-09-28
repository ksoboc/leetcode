package SortArrayByParity;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.sortArrayByParity(new int[]{3,1,2,4});
        System.out.println("res = " + Arrays.toString(res));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.sortArrayByParity(new int[]{0});
        System.out.println("res = " + Arrays.toString(res));
        assertArrayEquals(new int[]{0},res);
    }

}