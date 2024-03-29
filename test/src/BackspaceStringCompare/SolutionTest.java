package BackspaceStringCompare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res=solution.backspaceCompare("ab#c","ad#c");
        assertTrue(res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res=solution.backspaceCompare("ab##","c#d#");
        assertTrue(res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res=solution.backspaceCompare("a#c","b");
        assertFalse(res);
    }

}