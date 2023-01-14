package SortCharactersByFrequency;

import java.util.*;

public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        char[] arr = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (var ch : arr) {
            freq.merge(ch, 1, (a, b) -> a + b);
            list.add(ch);
        }
        Collections.sort(list, (a, b) -> {
            var res = freq.get(b).compareTo(freq.get(a));
            if (res == 0) return a.compareTo(b);
            return res;
        });
        StringBuilder sb = new StringBuilder();
        for (var ch : list) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
