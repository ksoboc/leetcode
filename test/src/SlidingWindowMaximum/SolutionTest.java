package SlidingWindowMaximum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        assertArrayEquals(new int[]{3,3,5,5,6,7},res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.maxSlidingWindow(new int[]{1},1);
        assertArrayEquals(new int[]{1},res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.maxSlidingWindow(new int[]{1,-1},1);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        assertArrayEquals(new int[]{1,-1},res);
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        var res = solution.maxSlidingWindow(new int[]{7,2,4},2);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        assertArrayEquals(new int[]{7,4},res);
    }

}