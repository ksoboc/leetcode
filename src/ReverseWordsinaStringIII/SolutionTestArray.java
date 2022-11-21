package ReverseWordsinaStringIII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTestArray {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWordsArr("Let's take LeetCode contest"));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals("doG gniD", solution.reverseWordsArr("God Ding"));
    }

}