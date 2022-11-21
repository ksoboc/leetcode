package ContainsDuplicateII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(true, solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(true, solution.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        assertEquals(false, solution.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }

}