package PartitiontoKEqualSumSubsets;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

import static java.util.Comparator.*;

public class Solution {
    int target;
    boolean used[];
    int[] nums;

    public boolean canPartitionKSubsets(int[] nums, int k) {
        var sum=0;
        for (var num:nums)
            sum+=num;

        if (sum%k!=0)
            return false;

        target=sum/k;
        used=new boolean[nums.length];

        this.nums = IntStream.of(nums).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        return dfs(0,k,0);

    }

    private boolean dfs(int i, int k, int subSum) {
        if (k==0)
            return true;
        if (subSum==target)
            return dfs(0,k-1,0);

        for (int j = i; j < nums.length; j++) {
            if (used[j] || subSum+nums[j]>target)
                continue;

            used[j] = true;
            if (dfs(j+1,k,subSum+nums[j]))
                return true;
            used[j]=false;

        }
        return false;
    }
}
