package MakeArrayStrictlyIncreasing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        Map<Integer, Integer> dp = new HashMap<>();
        Arrays.sort(arr2);
        dp.put(-1, 0);

        for (int val : arr1) {
            Map<Integer, Integer> newDp = new HashMap<>();
            for (var prev : dp.keySet()) {
                if (prev < val) {
                    newDp.put(val, Math.min(newDp.getOrDefault(val, 2_001), dp.get(prev)));
                }
                int k = findFistGreater(arr2, prev);
                if (k < arr2.length) {
                    newDp.put(arr2[k], Math.min(newDp.getOrDefault(arr2[k], 2_001), 1 + dp.get(prev)));
                }
            }
            dp = newDp;

        }
        int res = 2_001;
        for (var numChanges : dp.values()) {
            res = Math.min(res, numChanges);
        }

        if (res == 2_001) return -1;
        return res;

    }

    private int findFistGreater(int[] arr, int prev) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] <= prev) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}
