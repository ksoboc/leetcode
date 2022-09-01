package MaximumAreaofaPieceofCakeAfterHorizontalandVerticalCuts;

import java.util.Arrays;

public class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int maxh = getMaxDiff(h, horizontalCuts);
        int maxv = getMaxDiff(w, verticalCuts);

        int mod = 1_000_000_007;
        return (int)(((long)maxh*maxv) % mod);
    }

    private int getMaxDiff(int size, int[] cuts) {
        Arrays.sort(cuts);
        var max=cuts[0];
        for (var i=1;i<cuts.length;++i) {
            max=Math.max(max, cuts[i]-cuts[i-1]);
        }
        max=Math.max(max, size - cuts[cuts.length - 1]);
        return max;
    }

}
