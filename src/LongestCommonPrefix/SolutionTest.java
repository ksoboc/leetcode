package LongestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

}