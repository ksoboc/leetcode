package FindFirstandLastPositionofElementinSortedArray;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        var left = binSearch(nums, target, true);
        var right = left == -1 ? -1 : binSearch(nums, target, false);
        return new int[]{left, right};
    }

    private int binSearch(int[] nums, int target, boolean leftBias) {
        var l = 0;
        var r = nums.length - 1;
        var res = -1;
        while (l <= r) {
            var m = (l + r) / 2;
            if (nums[m] > target)
                r = m - 1;
            else if (nums[m] < target)
                l = m + 1;
            else {
                res = m;
                if (leftBias)
                    r = m - 1;
                else
                    l = m + 1;
            }
        }
        return res;
    }
}
