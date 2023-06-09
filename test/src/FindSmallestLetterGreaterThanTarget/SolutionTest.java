package FindSmallestLetterGreaterThanTarget;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals('c',solution.nextGreatestLetter(new char[]{'c','f','j'},'a'));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals('f',solution.nextGreatestLetter(new char[]{'c','f','j'},'c'));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals('x',solution.nextGreatestLetter(new char[]{'x','x','y','y'},'z'));
    }

}