package LetterCombinationsofaPhoneNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.letterCombinations("23");
        System.out.println("res = " + res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.letterCombinations("");
        System.out.println("res = " + res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.letterCombinations("2");
        System.out.println("res = " + res);
    }

}