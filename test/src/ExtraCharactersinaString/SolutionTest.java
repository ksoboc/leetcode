package ExtraCharactersinaString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res=solution.minExtraChar("leetscode", new String[]{"leet","code","leetcode"});
        assertEquals(1,res);
    }

    @Test
    void test2() {
        Solution solution=new Solution();
        var res=solution.minExtraChar("sayhelloworld", new String[]{"hello","world"});
        assertEquals(3,res);
    }


}