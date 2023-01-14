package ArithmeticSlicesIISubsequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public
class Solution {
    private int n;
    private int ans;


    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        long ans = 0;
        Map<Integer, Integer>[] cnt = new Map[n];
        for (int i = 0; i < n; i++) {
            cnt[i] = new HashMap<>(i);
            for (int j = 0; j < i; j++) {
                long delta = (long)nums[i] - (long)nums[j];
                if (delta < Integer.MIN_VALUE || delta > Integer.MAX_VALUE) {
                    continue;
                }
                int diff = (int)delta;
                int sum = cnt[j].getOrDefault(diff, 0);
                int origin = cnt[i].getOrDefault(diff, 0);
                cnt[i].put(diff, origin + sum + 1);
                ans += sum;
            }
        }
        return (int)ans;
    }
}

