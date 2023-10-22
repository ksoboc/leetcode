package MaximumScoreofaGoodSubarray;

public class Solution {
    public int maximumScore(int[] nums, int k) {
        final int n = nums.length;
        int ans = nums[k];
        int l = k;
        int r = k;
        int curMin = nums[k];
        while (l > 0 || r < n) {
            int lv = l > 0 ? nums[l - 1] : 0;
            int rv = r < n - 1 ? nums[r + 1] : 0;
            if (lv > rv) {
                --l;
                curMin = Math.min(curMin, lv);
            } else {
                ++r;
                curMin = Math.min(curMin, rv);
            }
            ans = Math.max(ans, (r - l + 1) * curMin);
        }
        return ans;
    }
}
