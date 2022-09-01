package LongestSubstringWithoutRepeateingCharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        var l = 0;
        Set<Character> charSet = new HashSet<>();
        var ans = 0;

        for (var r=0; r<s.length();++r) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                ++l;
            }
            charSet.add(s.charAt(r));

            ans = Math.max(ans, r-l+1);

        }
        return ans;

    }
}
