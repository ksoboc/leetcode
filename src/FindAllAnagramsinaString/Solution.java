package FindAllAnagramsinaString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0 || s.length() < p.length()) {
            return result;
        }


        int[] charCnts = new int[26];
        int cnt = 0;
        for (char c : p.toCharArray()) {
            if (charCnts[c - 'a'] == 0)
                ++cnt;
            ++charCnts[c - 'a'];

        }

        int left = 0, right = 0, count = cnt;
        while (right < s.length()) {
            char c = s.charAt(right);

            --charCnts[c - 'a'];
            if (charCnts[c - 'a'] == 0) {
                cnt--;
            }

            right++;

            while (cnt == 0) {
                char temp = s.charAt(left);

                ++charCnts[temp - 'a'];
                if (charCnts[temp - 'a'] > 0) {
                    cnt++;
                }

                if (right - left == p.length()) {
                    result.add(left);
                }
                left++;
            }
        }
        return result;
    }
}