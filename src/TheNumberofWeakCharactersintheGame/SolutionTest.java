package TheNumberofWeakCharactersintheGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(0, solution.numberOfWeakCharacters(new int[][]{{5,5},{6,3},{3,6}}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(1, solution.numberOfWeakCharacters(new int[][]{{2,2},{3,3}}));
    }

}