package StringCompressionII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTestDP {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(4, solution.getLengthOfOptimalCompressionDP("aaabcccd",2));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(2, solution.getLengthOfOptimalCompressionDP("aabbaa",2));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(3, solution.getLengthOfOptimalCompressionDP("aaaaaaaaaaa",0));
    }

}