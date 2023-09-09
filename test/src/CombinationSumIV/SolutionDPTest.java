package CombinationSumIV;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        var res=solution.combinationSum4(new int[]{1,2,3},4);
        assertEquals(7,res);
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        var res=solution.combinationSum4(new int[]{9},3);
        assertEquals(0,res);
    }

}