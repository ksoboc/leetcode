package PartitiontoKEqualSumSubsets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        int[] nums = {4,3,2,3,5,2,1};
        int k = 4;

        assertTrue(solution.canPartitionKSubsets(nums,k));
    }

}