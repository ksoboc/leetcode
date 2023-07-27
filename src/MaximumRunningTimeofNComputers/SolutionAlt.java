package MaximumRunningTimeofNComputers;

import java.util.Arrays;

public class SolutionAlt {
    public long maxRunTime(int n, int[] batteries) {
        Arrays.sort(batteries);
        long extra = 0;
        for (int i = 0; i < batteries.length - n; i++) {
            extra += batteries[i];
        }
        int[] live = Arrays.copyOfRange(batteries, batteries.length - n, batteries.length);
        for (int i = 0; i < n - 1; i++) {
            long needed = (long) (i + 1) * (live[i + 1] - live[i]);
            if (extra < needed)
                return live[i] + extra / (i + 1);
            extra -= needed;
        }

        return live[n - 1] + extra / n;
    }

}
