package ValidAnagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        assertTrue(solution.isAnagram("anagram", "nagaram"));
        assertFalse(solution.isAnagram("rat", "car"));
    }

}