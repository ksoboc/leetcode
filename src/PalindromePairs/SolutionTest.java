package PalindromePairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res = solution.palindromePairs(new String[]{"abcd","dcba","lls","s","sssll"});

        System.out.println("res = " + res);
        assertEquals("[[0, 1], [1, 0], [2, 4], [3, 2]]", res.toString());
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res = solution.palindromePairs(new String[]{"bat","tab","cat"});

        System.out.println("res = " + res);
        assertEquals("[[0, 1], [1, 0]]", res.toString());
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        var res = solution.palindromePairs(new String[]{"a",""});

        System.out.println("res = " + res);
        assertEquals("[[0, 1], [1, 0]]", res.toString());
    }
    @Test
    void test4() {
        //[]
        Solution solution=new Solution();

        var res = solution.palindromePairs(new String[]{"a","abc","aba",""});

        System.out.println("res = " + res);
        assertEquals("[[0, 3], [2, 3], [3, 0], [3, 2]]", res.toString());
    }

    @Test
    void test5() {
        //[]
        Solution solution=new Solution();

        var res = solution.palindromePairs(new String[]{"a","b","c","ab","ac","aa"});

        System.out.println("res = " + res);
        assertEquals("[[0, 5], [1, 3], [2, 4], [3, 0], [4, 0], [5, 0]]", res.toString());
    }

}