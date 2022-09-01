package RemoveDuplicatesfromSortedArray;

public class Solution {
    public int removeDuplicates(int[] nums) {
        var l = 1;

        for (var r = 1; r < nums.length; r++) {
            if (nums[r] != nums[r - 1]) {
                nums[l] = nums[r];
                ++l;
            }

        }
        return l;

    }
}
