package SortVowelsinaString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for (var ch:s.toCharArray()) {
            if ("aeiou".indexOf(Character.toLowerCase(ch))>-1)
                vowels.add(ch);
        }
        Collections.sort(vowels, Comparator.comparingInt(a -> a));
        StringBuilder sb = new StringBuilder();
        int j=0;
        for (var ch:s.toCharArray()) {
            if ("aeiou".indexOf(Character.toLowerCase(ch))>-1) {
                sb.append(vowels.get(j++));
            } else
                sb.append(ch);
        }
        return sb.toString();
    }
}
