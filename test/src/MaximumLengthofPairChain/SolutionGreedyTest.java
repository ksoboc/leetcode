package MaximumLengthofPairChain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionGreedyTest {
    @Test
    void test1() {
        SolutionGreedy solution=new SolutionGreedy();
        int[][] pairs = {{1,2},{2,3},{3,4}};
        var res = solution.findLongestChain(pairs);
        assertEquals(2,res);
    }
    @Test
    void test2() {
        SolutionGreedy solution=new SolutionGreedy();
        int[][] pairs = {{1,2},{7,8},{4,5}};
        var res = solution.findLongestChain(pairs);
        assertEquals(3,res);
    }

}