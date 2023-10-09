package FindFirstandLastPositionofElementinSortedArray;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = binSearch(nums,target,0,true);
        if (first==-1)
            return new int[]{-1,-1};
        int second = binSearch(nums,target,first,false);
        return new int[]{first,second};
    }

    private int binSearch(int[] nums, int target, int leftStart, boolean leftBias) {
        int l=leftStart;
        int r=nums.length-1;
        int res=-1;
        while (l<=r) {
            int m=l+(r-l)/2;
            if (nums[m]<target) {
                l=m+1;
            } else if (nums[m]>target) {
                r=m-1;
            } else {
                res=m;
                if (leftBias) {
                    r=m-1;
                } else {
                    l=m+1;
                }
            }
        }
        return res;
    }
}
