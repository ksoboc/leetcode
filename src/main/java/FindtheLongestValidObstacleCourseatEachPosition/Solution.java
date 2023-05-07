package FindtheLongestValidObstacleCourseatEachPosition;

public class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        final int n = obstacles.length;
        int[] longIncrSubs = new int[n];
        int[] answer = new int[n];
        int lisLen = 0;
        for (int i = 0; i < n; i++) {
            int idx = findLIS(longIncrSubs, obstacles[i], lisLen);
            if (idx == lisLen) {
                ++lisLen;
            }
            longIncrSubs[idx] = obstacles[i];
            answer[i] = idx + 1;
        }
        return answer;
    }

    private int findLIS(int[] arr, int target, int r) {
        if (r == 0) return 0;
        int l = 0;
        while (l < r) {
            int m = l + (r-l) / 2;
            if (arr[m] <= target) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}
