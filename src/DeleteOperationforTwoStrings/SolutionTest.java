package DeleteOperationforTwoStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(2, solution.minDistance("sea","eat"));
    }

    @Test
    void test2() {
        assertEquals(4, solution.minDistance("leetcode","etco"));
    }

    @Test
    void test3() {
        assertEquals(2, solution.minDistanceDP("sea","eat"));
    }

    @Test
    void test4() {
        assertEquals(4, solution.minDistanceDP("leetcode","etco"));
    }

}