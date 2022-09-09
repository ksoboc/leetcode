package TheNumberofWeakCharactersintheGame;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, Comparator.comparingInt((int[] a) -> a[0]).reversed().thenComparing(a -> a[1]));

        int res = 0;
        int maxd = 0;

        for (int[] property : properties) {
            if (property[1] < maxd) {
                ++res;
            } else
                maxd = Math.max(maxd, property[1]);
        }

        return res;
    }
}
