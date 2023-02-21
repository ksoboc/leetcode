package SingleElementinaSortedArray;

public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int r= nums.length-1;
        int l= 0;
        while (l<=r) {
            int mid = l + (r-l)/2;
            boolean even = mid%2==0;
            if (even) {
                if (mid< nums.length-2 && nums[mid] == nums[mid + 1]) {
                    l = mid + 2;
                } else if (mid>1 && nums[mid] == nums[mid-1]) {
                    r=mid;
                } else
                    return nums[mid];
            } else {
                if (mid< nums.length-1 && nums[mid] == nums[mid+1]) {
                    r=mid-1;
                } else  if (mid>0 && nums[mid] == nums[mid-1]) {
                    l=mid+1;
                } else
                    return nums[mid];
            }

        }
        return -1;
    }
}
