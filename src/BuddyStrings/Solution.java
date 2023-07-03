package BuddyStrings;

public class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;

        int[] freq = new int[26];

        int numDiff = 0;
        int p1 = 0, p2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                ++numDiff;
                if (numDiff == 1) p1 = i;
                else if (numDiff == 2) p2 = i;
                else
                    return false;
            }
            ++freq[s.charAt(i) - 'a'];
        }
        if (numDiff == 0) {
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] >= 2)
                    return true;
            }
            return false;
        } else if (numDiff == 2) {
            return s.charAt(p1) == goal.charAt(p2) && s.charAt(p2) == goal.charAt(p1);
        }
        return false;
    }
}
