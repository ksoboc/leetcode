package productExceptSelf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        int [] nums = {1,2,3,4};
        Solution solution = new Solution();

        assertArrayEquals(new int[]{24,12,8,6}, solution.productExceptSelf(nums));
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        int [] nums = {-1,1,0,-3,3};
        assertArrayEquals(new int[]{0,0,9,0,0}, solution.productExceptSelf(nums));
    }

}