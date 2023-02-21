package FindClosestNodetoGivenTwoNodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution = new Solution();

        assertEquals(2, solution.closestMeetingNode(new int[]{2, 2, 3, -1}, 0, 1));
    }
    @Test
    void test2() {
        Solution solution = new Solution();

        assertEquals(2, solution.closestMeetingNode(new int[]{1,2,-1}, 0, 2));
    }

}