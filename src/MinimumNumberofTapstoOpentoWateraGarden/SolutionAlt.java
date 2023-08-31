package MinimumNumberofTapstoOpentoWateraGarden;

import java.util.Arrays;
import java.util.Comparator;

public class SolutionAlt {
    public int minTaps(int n, int[] ranges) {
        int[] maxReach = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            int left = i - ranges[i];
            int right = i + ranges[i];
            left=Math.max(0,left);
            right=Math.min(n,right);
            maxReach[left]=right;
        }
        int count = 0;
        int maxRight=0;
        int currRight=0;
        for (int i = 0; i < n+1; i++) {
            if (i>maxRight)
                return -1;
            if (i>currRight) {
                ++count;
                currRight=maxRight;
            }
            maxRight=Math.max(maxRight,maxReach[i]);
        }
        return count;
    }
}
