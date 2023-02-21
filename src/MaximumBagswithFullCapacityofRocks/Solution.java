package MaximumBagswithFullCapacityofRocks;

import java.util.Arrays;

public class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        for (int i=0;i<n;++i)
            capacity[i]-=rocks[i];

        Arrays.sort(capacity);
        int maxBags = 0;
        int rocksLeft = additionalRocks;
        for (int i = 0; i < n; i++) {
            if (capacity[i]<=rocksLeft) {
                rocksLeft-=capacity[i];
                ++maxBags;
            } else
                break;
       }
        return maxBags;
    }
}
