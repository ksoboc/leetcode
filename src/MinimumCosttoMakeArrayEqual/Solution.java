package MinimumCosttoMakeArrayEqual;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        int[][] numAndCost = new int[n][2];
        for (int i = 0; i < n; i++) {
            numAndCost[i][0] = nums[i];
            numAndCost[i][1] = cost[i];
        }
        Arrays.sort(numAndCost, Comparator.comparingInt(a -> a[0]));
        long[] prefixSumCost = new long[n];
        prefixSumCost[0] = numAndCost[0][1];
        for (int i = 1; i < n; i++) {
            prefixSumCost[i] = numAndCost[i][1] + prefixSumCost[i - 1];
        }
        long totalCost = 0L;
        for (int i = 1; i < n; i++) {
            totalCost += (long) numAndCost[i][1] * ((long)numAndCost[i][0] - numAndCost[0][0]);
        }
        long minTotalCost = totalCost;
        for (int i = 1; i < n; i++) {
            int gap = numAndCost[i][0] - numAndCost[i - 1][0];
            totalCost += (long) gap * prefixSumCost[i - 1];
            totalCost -= (long) gap * (prefixSumCost[n - 1] - prefixSumCost[i - 1]);
            minTotalCost = Math.min(minTotalCost, totalCost);
        }
        return minTotalCost;
    }

}
