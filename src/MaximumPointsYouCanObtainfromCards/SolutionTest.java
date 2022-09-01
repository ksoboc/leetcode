package MaximumPointsYouCanObtainfromCards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        var res = solution.maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3);

        assertEquals(12, res);
    }

    @Test
    void test2() {
        var res = solution.maxScore(new int[]{2, 2, 2}, 2);

        assertEquals(4, res);
    }

    @Test
    void test3() {
        var res = solution.maxScore(new int[]{9, 7, 7, 9, 7, 7, 9}, 7);
        assertEquals(55, res);
    }

    //96,90,41,82,39,74,64,50,30
    @Test
    void test4() {
        var res = solution.maxScore(new int[]{96, 90, 41, 82, 39, 74, 64, 50, 30}, 8);
        assertEquals(536, res);
    }

}