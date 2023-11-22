package DiagonalTraverseII;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(List.of(1,2,3));
        nums.add(List.of(4,5,6));
        nums.add(List.of(7,8,9));

        Solution solution=new Solution();
        var res = solution.findDiagonalOrder(nums);
        System.out.println(Arrays.toString(res));
        assertArrayEquals(new int[]{1, 4, 2, 7, 5, 3, 8, 6, 9},res);
    }
    @Test
    void test2() {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(List.of(1,2,3,4,5));
        nums.add(List.of(6,7));
        nums.add(List.of(8));
        nums.add(List.of(9,10,11));
        nums.add(List.of(12,13,14,15,16));

        Solution solution=new Solution();
        var res = solution.findDiagonalOrder(nums);
        System.out.println(Arrays.toString(res));
        assertArrayEquals(new int[]{1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16},res);
    }

    @Test
    void test3() {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(List.of(1,2,3,4,5,6));


        Solution solution=new Solution();
        var res = solution.findDiagonalOrder(nums);
        System.out.println(Arrays.toString(res));
        assertArrayEquals(new int[]{1,2,3,4,5,6},res);
    }
    @Test
    void test4() {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(List.of(14,12,19,16,9));
        nums.add(List.of(13,14,15,8,11));
        nums.add(List.of(11,13,1));

        Solution solution=new Solution();
        var res = solution.findDiagonalOrder(nums);
        System.out.println(Arrays.toString(res));
        assertArrayEquals(new int[]{14,13,12,11,14,19,13,15,16,1,8,9,11},res);
    }

}