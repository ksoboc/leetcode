package HouseRobber;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void prepare() {
        solution = new Solution();
    }

    @Test
    void test1() {
        assertEquals(4, solution.rob(new int[]{1,2,3,1}));
    }

    @Test
    void test2() {
        assertEquals(12, solution.rob(new int[]{2,7,9,3,1}));
    }

}