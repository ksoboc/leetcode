package StringCompression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        char[] chars = {'a','a','b','b','c','c','c'};
        var res = solution.compress(chars);
        System.out.println("res = " + res);
        System.out.println("chars = " + String.copyValueOf(chars));
        assertEquals(6,res);

    }

    @Test
    void test2() {
        Solution solution=new Solution();
        char[] chars = {'a'};
        var res = solution.compress(chars);
        System.out.println("res = " + res);
        System.out.println("chars = " + String.copyValueOf(chars));
        assertEquals(1,res);

    }

    @Test
    void test3() {
        Solution solution=new Solution();
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        var res = solution.compress(chars);
        System.out.println("res = " + res);
        System.out.println("chars = " + String.copyValueOf(chars));
        assertEquals(4,res);

    }
    //
    @Test
    void test4() {
        Solution solution=new Solution();
        char[] chars = {'a','a','a','b','b','a','a'};
        var res = solution.compress(chars);
        System.out.println("res = " + res);
        System.out.println("chars = " + String.copyValueOf(chars));
        assertEquals(6,res);

    }

}