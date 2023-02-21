package SingleElementinaSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(2, solution.singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(10, solution.singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(13, solution.singleNonDuplicate(new int[]{3,3,7,7,11,11,13}));
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        assertEquals(1, solution.singleNonDuplicate(new int[]{1,3,3,7,7,11,11}));
    }
}