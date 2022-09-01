package permutations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        int[] nums = {0,1};
        Solution solution = new Solution();
        var list = solution.permute(nums);

        System.out.println("list = " + list);
    }


    @Test
    void permuteHeap() {
        int[] nums = {1,2,3};
        Solution solution = new Solution();
        var list = solution.permuteHeap(nums);

        System.out.println("list = " + list);
    }
}