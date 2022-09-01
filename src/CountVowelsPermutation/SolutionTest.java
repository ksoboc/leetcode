package CountVowelsPermutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution=new Solution();

        assertEquals(5, solution.countVowelPermutation(1));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(10, solution.countVowelPermutation(2));
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        assertEquals(68, solution.countVowelPermutation(5));
    }
    //144 18208803
    @Test
    void test4() {
        Solution solution=new Solution();

        assertEquals(18208803, solution.countVowelPermutation(144));
    }

}