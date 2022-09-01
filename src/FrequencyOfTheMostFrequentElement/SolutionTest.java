package FrequencyOfTheMostFrequentElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution = new Solution();

        System.out.println("solution.maxFrequency(new int[]{1,2,4}, 5) = " + solution.maxFrequency(new int[]{1, 2, 4}, 5));
        assertEquals(3,solution.maxFrequency(new int[]{1, 2, 4}, 5));
    }

    @Test
    void test2() {
        Solution solution = new Solution();

        assertEquals(2,solution.maxFrequency(new int[]{1,4,8,13}, 5));
    }

}