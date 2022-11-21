package ReverseWordsinaStringIII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWords("Let's take LeetCode contest"));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals("doG gniD", solution.reverseWords("God Ding"));
    }

}