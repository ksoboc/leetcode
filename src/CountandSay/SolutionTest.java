package CountandSay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res=solution.countAndSay(1);
        System.out.println("res = " + res);
        assertEquals("1",res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res=solution.countAndSay(4);
        System.out.println("res = " + res);
        assertEquals("1211",res);
    }


}