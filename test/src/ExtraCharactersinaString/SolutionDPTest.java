package ExtraCharactersinaString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        var res=solution.minExtraChar("leetscode", new String[]{"leet","code","leetcode"});
        assertEquals(1,res);
    }

    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        var res=solution.minExtraChar("sayhelloworld", new String[]{"hello","world"});
        assertEquals(3,res);
    }


}