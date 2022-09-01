package ValidPalindromeII;

public class Solution {
    public boolean validPalindrome(String s) {
        var l = 0;
        var r = s.length() - 1;

        var deleted = false;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                if (!deleted && l < r) {
                    return isPalindrome(s.substring(l+1,r+1)) ||
                            isPalindrome(s.substring(l,r));
                } else
                    return false;
            }
            l += 1;
            r -= 1;
        }
        return true;
    }

    private boolean isPalindrome(String s) {
        var l = 0;
        var r = s.length() - 1;

        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                    return false;
            }
            l += 1;
            r -= 1;
        }
        return true;

    }
}
