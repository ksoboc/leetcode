package UniqueMorseCodeWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(2, solution.uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(1, solution.uniqueMorseRepresentations(new String[]{"a"}));
    }

}