package FindFirstandLastPositionofElementinSortedArray;

public class SolutionAlt {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r= nums.length-1;
        int first=-1;
        while (l<=r) {
            int m=l+(r-l)/2;
            if (nums[m]>=target) {
                r=m-1;
                if (nums[m]==target)
                    first=m;
            } else {
                l=m+1;
            }
        }
        if (first==-1)
            return new int[]{-1,-1};
        int second=first;
        l=first;
        r= nums.length-1;
        while (l<=r) {
            int m=l+(r-l)/2;
            if (nums[m]>target) {
                r=m-1;
            } else {
                l=m+1;
                if (nums[m]==target)
                    second=m;
            }
        }

        return new int[]{first,second};
    }

}
