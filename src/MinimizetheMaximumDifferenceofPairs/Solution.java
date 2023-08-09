package MinimizetheMaximumDifferenceofPairs;

import java.util.Arrays;

public class Solution {
    public int minimizeMax(int[] nums, int p) {
        if (p==0)
            return 0;
        Arrays.sort(nums);
        int l=0;
        int r=nums[nums.length-1]-nums[0];
        while (l<r) {
            int mid = l + (r-l)/2;
            if (!numPairs(nums,mid,p)) {
                l=mid+1;
            } else {
                r=mid;
            }
        }
        return r;
    }

    private boolean numPairs(int[] nums, int mid, int p) {
        int count=0;
        int i=0;
        while (i< nums.length-1) {
                if (nums[i+1]-nums[i]<=mid) {
                    ++count;
                    if (count >= p)
                        return true;
                    i+=2;
                } else ++i;
        }
        return false;
    }
}
