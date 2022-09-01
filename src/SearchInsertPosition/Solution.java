package SearchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        var l = 0;
        var r = nums.length - 1;

        while (l <= r) {
            var mid = (l + r) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
