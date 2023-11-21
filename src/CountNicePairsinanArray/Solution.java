package CountNicePairsinanArray;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countNicePairs(int[] nums) {
        final int mod = 1_000_000_007;
        Map<Integer, Integer> freq = new HashMap<>();
        for (var num : nums) {
            int val = num - rev(num);
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }
        long numNicePairs = 0L;
        for (var cnt : freq.values()) {
            numNicePairs += cnt * (cnt - 1L) / 2L;
            numNicePairs %= mod;
        }
        return (int) numNicePairs;

    }

    private int rev(int num) {

        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}
