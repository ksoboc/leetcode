package MajorityElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(3, solution.majorityElement(new int[]{3,2,3}));
    }

    @Test
    void test1() {
        assertEquals(2, solution.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

}