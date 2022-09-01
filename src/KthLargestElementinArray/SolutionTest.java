package KthLargestElementinArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(5, solution.findKthLargest(new int[]{3,2,1,5,6,4}, 2));

    }

    @Test
    void test2() {
        Solution solution = new Solution();
        assertEquals(4, solution.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }

}