package KthSymbolinGrammar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.kthGrammar(1,1);
        assertEquals(0,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.kthGrammar(2,1);
        assertEquals(0,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.kthGrammar(2,2);
        assertEquals(1,res);
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        var str = "0110";
        int i=1;
        for (var ch:str.toCharArray()) {
            var val = ch - '0';
            assertEquals(val, solution.kthGrammar(3,i));
            ++i;
        }
    }

}