package JumpGameIV;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(3, solution.minJumps(new int[]{100,-23,-23,404,100,23,23,23,3,404}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(0, solution.minJumps(new int[]{7}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(1, solution.minJumps(new int[]{7,6,9,6,9,6,9,7}));
    }

}