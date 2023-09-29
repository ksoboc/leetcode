package MonotonicArray;

public class Solution {
    public boolean isMonotonic(int[] nums) {
        int dir = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 0) {
                if (dir == -1)
                    return false;
                dir = 1;
            } else if (nums[i + 1] - nums[i] < 0) {
                if (dir == 1)
                    return false;
                dir = -1;
            }
        }
        return true;
    }
}
