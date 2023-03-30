package ScrambleString;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public  boolean isScramble(String s1, String s2) {
        Map<String, Boolean> memo = new HashMap<>();
        return isScramble(s1,s2,memo);
    }

    private   boolean isScramble(String s1, String s2, Map<String, Boolean> memo) {
        String key = s1 + "|" + s2;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // Base case: if the strings are equal, they are scrambled
        if (s1.equals(s2)) {
            memo.put(key, true);
            return true;
        }

        // Check if the strings contain the same characters
        if (!hasSameChars(s1, s2)) {
            memo.put(key, false);
            return false;
        }

        int n = s1.length();
        for (int i = 1; i < n; i++) {
            String s1Left = s1.substring(0, i);
            String s1Right = s1.substring(i);
            String s2Left = s2.substring(0, i);
            String s2Right = s2.substring(i);

            // Case 1: Substrings are not swapped
            if (isScramble(s1Left, s2Left, memo) && isScramble(s1Right, s2Right, memo)) {
                memo.put(key, true);
                return true;
            }

            // Case 2: Substrings are swapped
            String s2LeftSwapped = s2.substring(n - i);
            String s2RightSwapped = s2.substring(0, n - i);

            if (isScramble(s1Left, s2LeftSwapped, memo) && isScramble(s1Right, s2RightSwapped, memo)) {
                memo.put(key, true);
                return true;
            }
        }

        memo.put(key, false);
        return false;
    }

    private  boolean hasSameChars(String s1, String s2) {
        int[] chars = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            chars[s1.charAt(i) - 'a']++;
            chars[s2.charAt(i) - 'a']--;
        }

        for (int count : chars) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }


}
