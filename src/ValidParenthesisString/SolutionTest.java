package ValidParenthesisString;

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
        System.out.println("solution.checkValidString(\"()\") = " + solution.checkValidString("()"));
        assertTrue(solution.checkValidString("()"));
    }

    @Test
    void test2() {
        System.out.println("solution.checkValidString(\"(*)\") = " + solution.checkValidString("(*)"));
        assertEquals(true, solution.checkValidString("(*)"));
    }

    @Test
    void test3() {
        System.out.println("solution.checkValidString(\"(*))\") = " + solution.checkValidString("(*))"));
        assertEquals(true, solution.checkValidString("(*))"));
    }

    @Test
    void test4() {
        System.out.println("solution.checkValidString(\")(*))\") = " + solution.checkValidString(")(*))"));
        assertFalse(solution.checkValidString(")(*))"));
    }

    @Test
    void test5() {
        assertTrue(solution.checkValidString("((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()"
        ));
    }

    @Test
    void test6() {
        assertFalse(solution.checkValidString("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"));
    }

}