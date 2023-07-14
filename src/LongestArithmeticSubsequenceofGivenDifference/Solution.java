package LongestArithmeticSubsequenceofGivenDifference;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> longest = new HashMap<>();
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = 1 + longest.getOrDefault(arr[i] - difference, 0);
            longest.put(arr[i], curr);
            if (curr > maxLength)
                maxLength = curr;
        }
        return maxLength;
    }
}
