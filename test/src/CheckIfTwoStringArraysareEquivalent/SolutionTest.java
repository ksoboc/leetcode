package CheckIfTwoStringArraysareEquivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        String[] word1={"ab", "c"};
        String[] word2={"a", "bc"};

        var res=solution.arrayStringsAreEqual(word1,word2);
        assertTrue(res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        String[] word1={"a", "cb"};
        String[] word2={"ab", "c"};

        var res=solution.arrayStringsAreEqual(word1,word2);
        assertFalse(res);
    }

}