package BagofTokens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(0, solution.bagOfTokensScore(new int[]{100},50));

    }

    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(1, solution.bagOfTokensScore(new int[]{100,200},150));

    }
    @Test
    void test3() {
        Solution solution=new Solution();

        assertEquals(2, solution.bagOfTokensScore(new int[]{100,200,300,400},200));

    }
    @Test
    void test4() {
        Solution solution=new Solution();

        assertEquals(0, solution.bagOfTokensScore(new int[]{71,55,82},54));

    }

}