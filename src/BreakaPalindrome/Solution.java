package BreakaPalindrome;

public class Solution {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length()<=1) return "";

        for (int i = 0; i < palindrome.length()/2; i++) {
            if (palindrome.charAt(i)!='a') {
                return new StringBuilder().append(palindrome.substring(0, i)).append('a').append(palindrome.substring(i + 1)).toString();
            }

        }
        return new StringBuilder().append(palindrome.substring(0, palindrome.length() - 1)).append('b').toString();
    }
}
