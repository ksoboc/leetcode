package MaximumRunningTimeofNComputers;

public class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (var b : batteries)
            sum += b;
        long l = 1;
        long r = sum / n;

        while (l < r) {
            long m = r - (r - l) / 2;
            if (timeAchievable(n, batteries, m)) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    private boolean timeAchievable(int n, int[] batteries, long target) {
        long sum = 0;
        for (var b : batteries) {
            sum += Math.min(target, b);
        }
        return sum >= (long) n * target;
    }
}
