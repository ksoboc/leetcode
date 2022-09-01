package ValidAnagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> chars = new HashMap<>();

        for (var i=0;i<s.length();++i) {

            chars.merge(s.charAt(i), 1, (prev,one)->prev+one);
        }

        for (var i=0;i<t.length();++i) {
            Character ch = t.charAt(i);

            if (!chars.containsKey(ch)) {
                return false;
            } else {
                chars.merge(ch, 0, (prev,next) -> (prev<=1)?null:prev-1);
            }
        }

        return chars.size() == 0;
    }
}
