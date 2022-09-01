package powxn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();

        System.out.println("solution.myPow(2.0, 10) = " + solution.myPow(2.0, 10));
    }

    @Test
    void test2() {
        Solution solution = new Solution();

        System.out.println("solution.myPow(2.0, -2) = " + solution.myPow(2.0, -2));
    }

    @Test
    void test3() {
        Solution solution = new Solution();
        System.out.println("solution.myPow(8.84372,-5) = " + solution.myPow(8.84372, -5));


    }

    @Test
    void test4() {
        Solution solution = new Solution();
        System.out.println("solution.myPow(2.00000,-2147483648) = " + solution.myPow(2.00000, -2147483648));
    }
}