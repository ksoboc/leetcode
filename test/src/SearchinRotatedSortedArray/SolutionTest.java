package SearchinRotatedSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums = {4,5,6,7,0,1,2};
        var res = solution.search(nums, 0);
        System.out.println("res = " + res);
        assertEquals(4,res);

    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] nums = {4,5,6,7,0,1,2};
        var res = solution.search(nums, 3);
        System.out.println("res = " + res);
        assertEquals(-1,res);

    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[] nums = {1};
        var res = solution.search(nums, 0);
        System.out.println("res = " + res);
        assertEquals(-1,res);

    }
    @Test
    void test4() {
        Solution solution=new Solution();
        int[] nums = {5,1,3};
        var res = solution.search(nums, 5);
        System.out.println("res = " + res);
        assertEquals(0,res);

    }

}