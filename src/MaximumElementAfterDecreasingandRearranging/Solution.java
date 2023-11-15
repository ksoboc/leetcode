package MaximumElementAfterDecreasingandRearranging;

import java.util.Arrays;

public class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        final int n=arr.length;
        Arrays.sort(arr);
        int ans = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] >= ans + 1) {
                ans++;
            }
        }

        return ans;
    }
}
