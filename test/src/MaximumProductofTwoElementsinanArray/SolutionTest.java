package MaximumProductofTwoElementsinanArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums = {3,4,5,2};
        var res=solution.maxProduct(nums);
        assertEquals(12,res);
    }

}