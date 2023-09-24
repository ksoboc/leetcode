package ChampagneTower;

public class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        int n = 1;
        double[] current = new double[n];
        current[0] = poured;
        for (int r = 0; r < query_row; ++r) {
            double[] newRow = new double[n + 1];
            for (int c = 0; c < n; ++c) {
                double excess = current[c] - 1.0;
                if (excess > 0.0) {
                    newRow[c] += excess / 2.0;
                    newRow[c + 1] += excess / 2.0;
                }
            }
            current = newRow;
            ++n;
        }
        return Math.min(current[query_glass], 1.0);
    }
}
