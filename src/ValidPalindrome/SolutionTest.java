package ValidPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        var s = "A man, a plan, a canal: Panama";
        assertTrue(solution.isPalindromeRev(s));
        s="race a car";
        assertFalse(solution.isPalindromeRev(s));
        s=" ";
        assertTrue(solution.isPalindromeRev(s));
        s="0P";

        assertFalse(solution.isPalindromeRev(s));


    }

}