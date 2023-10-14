package PaintingtheWalls;

import java.util.Arrays;

public class Solution {
    private long[][] dp;
    public int paintWalls(int[] cost, int[] time) {
        int totalTime = 0;
        for (int t : time) {
            totalTime+=t;
        }
        dp=new long[cost.length][totalTime+1];
        for (var r:dp)
            Arrays.fill(r,-1);


        return (int)helper(cost,time,cost.length,  0);
    }

    private long helper(int[] cost, int[] time, int remainingJobs,  int i) {
        if (remainingJobs<=0){
            return 0;
        }
        if (i>=cost.length) {
                return 2_000_000;
        }

        if (dp[i][remainingJobs]!=-1)
            return dp[i][remainingJobs];

        long withJob = cost[i] + helper(cost,time,remainingJobs-time[i]-1,i+1);
        long withoutJob = helper(cost,time,remainingJobs, i+1);

        long res = Math.min(withJob, withoutJob);
        dp[i][remainingJobs]=res;
        return res;
    }
}
