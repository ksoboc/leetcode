package LongestConsecutiveSequence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void prep() {
        solution = new Solution();
    }
    @Test
    void test() {
        int[] nums = {100,4,200,1,3,2};
        System.out.println("solution.longestConsecutive(nums) = " + solution.longestConsecutive(nums));
        assertEquals(4, solution.longestConsecutive(nums));
    }

    @Test
    void test2() {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println("solution.longestConsecutive(nums) = " + solution.longestConsecutive(nums));
        assertEquals(9, solution.longestConsecutive(nums));
    }

}