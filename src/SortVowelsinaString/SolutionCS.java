package SortVowelsinaString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SolutionCS {

    public static final String VOWELS = "AEIOUaeiou";

    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        int[] counts = new int[VOWELS.length()];
        for (var ch:s.toCharArray()) {
            int p= VOWELS.indexOf(ch);
            if (p>-1) {
                ++counts[p];
            }
        }
        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
                vowels.add(VOWELS.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        int j=0;
        for (var ch:s.toCharArray()) {
            if (VOWELS.indexOf(ch)>-1) {
                sb.append(vowels.get(j++));
            } else
                sb.append(ch);
        }
        return sb.toString();
    }
}
