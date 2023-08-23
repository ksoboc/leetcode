package ReorganizeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res=solution.reorganizeString("aab");
        System.out.println("res = " + res);
        assertEquals("aba",res);

    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res=solution.reorganizeString("aaab");
        System.out.println("res = " + res);
        assertEquals("",res);
    }

    @Test
    void test3() {
        Solution solution=new Solution();
        var res=solution.reorganizeString("vvvlo");
        System.out.println("res = " + res);
        assertEquals("vlvov",res);
    }

    @Test
    void test4() {
        Solution solution=new Solution();
        var res=solution.reorganizeString("abbabbaaab");
        System.out.println("res = " + res);
        assertEquals("ababababab",res);
    }

}