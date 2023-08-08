package SearchinRotatedSortedArray;

public class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int res = search(nums, target, pivot);
        return res;
    }

    int findPivot(int[] nums) {
        int l = 0;
        int n = nums.length;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] > nums[n - 1]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;

    }

    int search(int[] nums, int target, int offset) {
        int l = 0;
        final int n = nums.length;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int idx = (m + offset) % n;
            if (nums[idx] > target) {
                r = m - 1;
            } else if (nums[idx] < target) {
                l = m + 1;
            } else
                return idx;
        }
        return -1;
    }
}
