package LongestConsecutiveSequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (var n:nums)
            set.add(n);

        var longest = 0;

        for (var i=0;i<nums.length;++i) {
            if (!set.contains(nums[i]-1)) {
                var length = 1;
                while (set.contains(nums[i] + length)) {
                    ++length;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}
