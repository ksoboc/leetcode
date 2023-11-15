package MaximumElementAfterDecreasingandRearranging;

import java.util.Arrays;

public class SolutionNoSorting {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        final int n=arr.length;
        int[] count = new int[n+1];
        for (var num:arr)
            ++count[Math.min(num,n)];
        int ans = 1;

        for (int i = 2; i <= n; i++) {
            ans = Math.min(ans+count[i],i);
        }

        return ans;
    }
}
