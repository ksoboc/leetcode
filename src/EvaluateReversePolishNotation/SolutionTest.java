package EvaluateReversePolishNotation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void prep() {
        solution = new Solution();
    }
    @Test
    void test() {
        String[] tokens =  {"2","1","+","3","*"};
//        System.out.println("solution.evalRPN(tokens) = " + solution.evalRPN(tokens));
        assertEquals(9,solution.evalRPN(tokens));

    }

    @Test
    void test2() {
        String[] tokens = {"4","13","5","/","+"};
        assertEquals(6,solution.evalRPN(tokens));
    }

    @Test
    void test3() {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        assertEquals(22,solution.evalRPN(tokens));
    }
}