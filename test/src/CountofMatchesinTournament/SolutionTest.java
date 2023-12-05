package CountofMatchesinTournament;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res=solution.numberOfMatches(7);
        assertEquals(6,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res=solution.numberOfMatches(14);
        assertEquals(13,res);
    }

}