package ReverseWordsinaString;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals("blue is sky the",solution.reverseWords("the sky is blue"));
    }

}