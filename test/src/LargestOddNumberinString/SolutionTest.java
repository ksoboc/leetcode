package LargestOddNumberinString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.largestOddNumber("52");
        assertEquals("5",res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.largestOddNumber("4206");
        assertEquals("",res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.largestOddNumber("35427");
        assertEquals("35427",res);
    }

}