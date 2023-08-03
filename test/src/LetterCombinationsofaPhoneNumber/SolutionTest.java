package LetterCombinationsofaPhoneNumber;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.letterCombinations("23");
        assertEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.letterCombinations("");
        assertEquals(Collections.emptyList(),res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.letterCombinations("2");
        assertEquals(List.of("a","b","c"),res);
    }

}