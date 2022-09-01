package GenerateParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();
    @Test
    void test1() {
       assertEquals("()", solution.generateParenthesis(1).get(0));
    }

    @Test
    void test2() {
        System.out.println("solution.generateParenthesis(3) = " + solution.generateParenthesis(3));
    }

}