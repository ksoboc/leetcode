package FindtheDifference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.findTheDifference("abcd","abcde");
        assertEquals('e',res);

    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.findTheDifference("","y");
        assertEquals('y',res);

    }

}