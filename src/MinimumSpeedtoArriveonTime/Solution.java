package MinimumSpeedtoArriveonTime;

public class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if (hour <= dist.length - 1)
            return -1;

        int sum = 0;
        for (var d : dist)
            sum += d;
        int l = Math.max((int) (sum / hour),1);
        int r = 10_000_000;


        int minSpeed = l;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (enoughTime(dist, m, hour)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private boolean enoughTime(int[] dist, int speed, double hour) {
        int t = 0;
        for (int i = 0; i < dist.length - 1; ++i) {
            t += (dist[i] + speed - 1) / speed;
        }
        double dt = t + ((double) dist[dist.length - 1]) / speed;
        return hour >= dt;
    }


}
