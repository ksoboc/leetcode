package NumberofGoodPairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (var n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        int numOfIdentPairs = 0;
        for (var key : freq.keySet()) {
            int n = freq.get(key);
            numOfIdentPairs += n * (n - 1) / 2;
        }
        return numOfIdentPairs;
    }
}
