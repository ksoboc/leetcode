package WordLadder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        var res = solution.ladderLength("hit", "cog", new ArrayList<>(List.of("hot","dot","dog","lot","log","cog")));
        assertEquals(5,res);
    }

    @Test
    void test2() {
        var res = solution.ladderLength("hot", "dog", new ArrayList<>(List.of("hot","dog")));
        assertEquals(0,res);
    }

    @Test
    void test3() {
        var res = solution.ladderLength("red", "tax", new ArrayList<>(List.of("ted","tex","red","tax","tad","den","rex","pee")));
        assertEquals(4,res);
    }

}