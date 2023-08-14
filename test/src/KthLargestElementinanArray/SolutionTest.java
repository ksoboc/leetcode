package KthLargestElementinanArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res=solution.findKthLargest(new int[]{3,2,1,5,6,4},2);
        assertEquals(5,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res=solution.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4);
        assertEquals(4,res);
    }

}