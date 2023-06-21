package MinimumCosttoMakeArrayEqual;

public class SolutionBS {
    public long minCost(int[] nums, int[] cost) {
        int minNums = Integer.MAX_VALUE;
        int maxNums = Integer.MIN_VALUE;
        for (var num : nums) {
            minNums = Math.min(minNums, num);
            maxNums = Math.max(maxNums, num);
        }

        int l = minNums, r = maxNums;
        long minTotalCost = 0;
        while (l < r) {
            int m = l + (r - l) / 2;
            long cost1 = calcCost(nums, cost, m);
            long cost2 = calcCost(nums, cost, m + 1);
            minTotalCost = Math.min(cost1, cost2);
            if (cost2 > cost1) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return minTotalCost;
    }

    private long calcCost(int[] nums, int[] cost, int val) {
        long totalCost = 0L;
        for (int i = 0; i < nums.length; ++i)
            totalCost += (long) cost[i] * Math.abs(nums[i] - val);
        return totalCost;
    }
}
