package ConcatenatedWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTestDFS {
    @Test
    void test1() {
        SolutionDFS solution=new SolutionDFS();

        var res = solution.findAllConcatenatedWordsInADict(new String[]{"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"});
        System.out.println("res = " + res);
        assertEquals(3, res.size());
    }
    @Test
    void test2() {
        SolutionDFS solution=new SolutionDFS();

        var res = solution.findAllConcatenatedWordsInADict(new String[]{"cat","dog","catdog"});
        System.out.println("res = " + res);
        assertEquals(1, res.size());
    }

}