package ShuffletheArray;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n << 1];
        for (int i = 0; i < n; i++) {
            ans[i << 1] = nums[i];
            ans[(i<<1) + 1] = nums[i + n];
        }
        return ans;
    }
}
