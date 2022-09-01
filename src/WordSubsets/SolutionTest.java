package WordSubsets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test1() {
        var res=solution.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"e","o"});
        assertArrayEquals(new String[]{"facebook","google","leetcode"}, res.toArray());
    }
    @Test
    void test2() {
        var res=solution.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"l","e"});
        assertArrayEquals(new String[]{"apple","google","leetcode"}, res.toArray());
    }
}