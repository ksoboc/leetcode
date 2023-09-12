package MinimumDeletionstoMakeCharacterFrequenciesUnique;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ++freq[s.charAt(i) - 'a'];
        }

        Arrays.sort(freq);

        int numDeletions = 0;
        for (int i = freq.length - 2; i >= 0 && freq[i] > 0; --i) {
            if (freq[i] >= freq[i + 1]) {
                int tmp = freq[i];
                freq[i] = Math.max(0, freq[i + 1] - 1);
                numDeletions += tmp - freq[i];
            }
        }
        return numDeletions;
    }
}
