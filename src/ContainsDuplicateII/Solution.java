package ContainsDuplicateII;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k==0) return false;
        Map<Integer,Integer> pos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = pos.put(nums[i], i);
            if (index!=null && i - index<=k)
                return true;

        }
        return false;
    }
}
