package SearchInsertPosition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(2,solution.searchInsert(new int[]{1,3,5,6},5));
    }
    @Test
    void test2() {
        assertEquals(1,solution.searchInsert(new int[]{1,3,5,6},2));
    }
    @Test
    void test3() {
        assertEquals(4,solution.searchInsert(new int[]{1,3,5,6},7));
    }

}