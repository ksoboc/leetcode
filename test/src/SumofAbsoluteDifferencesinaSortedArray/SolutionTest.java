package SumofAbsoluteDifferencesinaSortedArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums = {2,3,5};
        var res = solution.getSumAbsoluteDifferences(nums);

        assertArrayEquals(new int[]{4, 3, 5},res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] nums = {1,4,6,8,10};
        var res = solution.getSumAbsoluteDifferences(nums);

        assertArrayEquals(new int[]{24, 15, 13, 15, 21},res);
    }

}