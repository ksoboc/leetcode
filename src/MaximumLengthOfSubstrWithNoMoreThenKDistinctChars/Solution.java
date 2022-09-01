package MaximumLengthOfSubstrWithNoMoreThenKDistinctChars;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int maxLenOfSubstrWithNoMoreThanKDistinctChars(String str, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int maxLength = Integer.MIN_VALUE;
        int currLength = 0;
        int l = 0;

        for (var r = 0; r < str.length(); ++r) {
            var ch = str.charAt(r);
            freq.merge(ch, 1, (cnt, one) -> cnt + 1);
            while (freq.size() > k) {
                var leftChar = str.charAt(l);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0)
                    freq.remove(leftChar);
                l += 1;
            }
            currLength = r - l + 1;
            maxLength = Math.max(maxLength, currLength);

        }
        return maxLength;

    }

    public static void main(String[] args) {
        var res = maxLenOfSubstrWithNoMoreThanKDistinctChars("AAAHHIBC", 2);
        System.out.println("res = " + res);

        res = maxLenOfSubstrWithNoMoreThanKDistinctChars("AHIBCCC", 2);
        System.out.println("res = " + res);
    }

}
