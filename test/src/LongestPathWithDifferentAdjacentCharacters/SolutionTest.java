package LongestPathWithDifferentAdjacentCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(3,solution.longestPath(new int[]{-1,0,0,1,1,2},"abacbe"));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(3,solution.longestPath(new int[]{-1,0,0,0},"aabc"));
    }

}