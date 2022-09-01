package CombinationSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test() {
        int[] candidates = {2,3,6,7};
        var target = 7;

        System.out.println(solution.combinationSum(candidates, target));
    }

}