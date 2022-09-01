package VerifyingAlienDictionary;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> order2Ind = new HashMap<>();
        for (var i = 0; i < order.length(); ++i) {
            var ch = order.charAt(i);
            order2Ind.put(ch, i);
        }

        for (var i = 0; i < words.length - 1; ++i) {
            var w1 = words[i];
            var w2 = words[i + 1];

            for (var j = 0; j < w1.length(); ++j) {
                if (j >= w2.length())
                    return false;

                var ch1 = w1.charAt(j);
                var ch2 = w2.charAt(j);

                if (ch1 != ch2) {
                    if (order2Ind.get(w2.charAt(j)) < order2Ind.get(w1.charAt(j)))
                        return false;

                    break;
                }
            }
        }
        return true;
    }
}
