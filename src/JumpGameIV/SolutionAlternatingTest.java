package JumpGameIV;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionAlternatingTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(3, solution.minJumpsAlternating(new int[]{100,-23,-23,404,100,23,23,23,3,404}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(0, solution.minJumpsAlternating(new int[]{7}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(1, solution.minJumpsAlternating(new int[]{7,6,9,6,9,6,9,7}));
    }

}