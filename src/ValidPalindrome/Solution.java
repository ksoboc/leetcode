package ValidPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        var l = 0;
        var r = s.length() - 1;

        while (l < r) {
            while (!Character.isLetterOrDigit(s.charAt(l)) && l < r) {
                ++l;
            }

            while (!Character.isLetterOrDigit(s.charAt(r)) && r > l) {
                --r;
            }

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            ++l; --r;


        }
        return true;

    }

    public boolean isPalindromeRev(String s) {
        StringBuilder sb = new StringBuilder();
        for (var i=0;i<s.length();++i) {
            var ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch))
                sb.append(Character.toLowerCase(ch));
        }

        String s2 = sb.toString();
        return sb.reverse().toString().equals(s2);
    }
}
