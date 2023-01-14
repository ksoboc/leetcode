package SortCharactersByFrequency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res=solution.frequencySort("tree");
        assertEquals("eert", res);
    }

}