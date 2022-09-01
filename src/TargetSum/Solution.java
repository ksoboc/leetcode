package TargetSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private int[] nums;
    private int target;

    class Pair {
        int i;
        int total;

        public Pair(int i, int total) {
            this.i = i;
            this.total = total;
        }
    }
    private Map<Pair,Integer> dp = new HashMap<>();
    public int findTargetSumWays(int[] nums, int target) {
        this.nums=nums;
        this.target=target;
        return backtrack(0,0);
    }

    private int backtrack(int i, int sumSoFar) {
        if (i==nums.length) {
            return sumSoFar==target?1:0;
        }
        Pair key = new Pair(i,sumSoFar);
        if (dp.containsKey(key))
            return dp.get(key);

        dp.put(key, backtrack(i+1,sumSoFar+nums[i])+backtrack(i+1,sumSoFar-nums[i]));
        return dp.get(key);

    }


}
