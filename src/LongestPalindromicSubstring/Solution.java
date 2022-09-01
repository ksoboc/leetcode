package LongestPalindromicSubstring;

public class Solution {
    private String res = "";
    private int longest = 0;

    public String longestPalindrome(String s) {

        for (var pos = 0; pos < s.length(); ++pos) {
            expandPalindrome(s, pos, pos);
            expandPalindrome(s, pos, pos + 1);
        }


        return res;
    }

    private void expandPalindrome(final String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            var len = r - l + 1;
            if (len > longest) {
                longest = len;
                res = s.substring(l, r + 1);
            }
            --l;
            ++r;
        }
    }
}
