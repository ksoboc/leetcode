package IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (s2t.containsKey(ch1)) {

                if (s2t.get(ch1) != ch2) {
                    return false;

                }
            } else {
                if (t2s.containsKey(ch2))
                    return false;
                s2t.put(ch1, ch2);
                t2s.put(ch2, ch1);
            }
        }

        return true;
    }
}