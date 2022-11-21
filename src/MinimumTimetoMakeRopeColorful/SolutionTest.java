package MinimumTimetoMakeRopeColorful;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static Solution solution;

    @BeforeAll
    static void  init() {
        solution=new Solution();
    }
    @Test
    void test1() {
        assertEquals(3,solution.minCost("abaac",new int[]{1,2,3,4,5}));
    }
    @Test
    void test2() {
        assertEquals(0,solution.minCost("abc",new int[]{1,2,3}));
    }
    @Test
    void test3() {
        assertEquals(2,solution.minCost("aabaa",new int[]{1,2,3,4,1}));
    }

    @Test
    void test4() {
        assertEquals(23,solution.minCost("bbbaaa",new int[]{4,9,3,8,8,9}));
    }
    @Test
    void test5() {
        assertEquals(26,solution.minCost("aaabbbabbbb",new int[]{3,5,10,7,5,3,5,5,4,8,1}));
    }

}