package NextClosestTime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals("19:39", solution.nextClosestTime("19:34"));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals("22:22", solution.nextClosestTime("23:59"));
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        assertEquals("11:11", solution.nextClosestTime("11:11"));
    }
    @Test
    void test4() {
        Solution solution=new Solution();

        assertEquals("18:11", solution.nextClosestTime("17:38"));
    }

}