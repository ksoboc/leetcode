package RemoveDuplicatesfromSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        assertEquals(2, solution.removeDuplicates(new int[]{1,1,2}));
    }
    @Test
    void test2() {
        assertEquals(5, solution.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

}