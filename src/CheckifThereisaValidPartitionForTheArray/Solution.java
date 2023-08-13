package CheckifThereisaValidPartitionForTheArray;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Boolean[] dp;
    public boolean validPartition(int[] nums) {
        dp = new Boolean[nums.length+1];
        return validPartition(nums,nums.length-1);
    }

    private boolean validPartition(int[] nums, int start) {

        if (start<0)
            return true;

        if (dp[start]!=null)
            return dp[start];

        boolean res= false;
        if (start>0 && nums[start]==nums[start-1]) {
            res |= validPartition(nums,start-2);
            if (start>1 && nums[start]==nums[start-2]) {
                res |= validPartition(nums,start-3);
            }
        }
        if (start>1 && nums[start] == nums[start-1] + 1 && nums[start-2]+2==nums[start]) {
            res |= validPartition(nums,start-3);
        }
        dp[start]=res;
        return res;

    }
}