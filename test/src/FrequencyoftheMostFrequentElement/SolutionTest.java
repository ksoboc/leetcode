package FrequencyoftheMostFrequentElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution2 solution=new Solution2();
        int[] nums = {1,2,4};
        var res = solution.maxFrequency(nums,5);
        assertEquals(3,res);
    }
    @Test
    void test2() {
        Solution2 solution=new Solution2();
        int[] nums = {1,4,8,13};
        var res = solution.maxFrequency(nums,5);
        assertEquals(2,res);
    }
    @Test
    void test3() {
        Solution2 solution=new Solution2();
        int[] nums = {3,9,6};
        var res = solution.maxFrequency(nums,2);
        assertEquals(1,res);
    }

}