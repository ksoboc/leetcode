package PerfectSquares;

import java.util.Arrays;

public class SolutionTab {

    public int numSquares(int n) {
        int[] sol = new int[n + 1];
        Arrays.fill(sol, Integer.MAX_VALUE);
        sol[0] = 0;
        sol[1] = 1;
        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; i >= j * j; ++j) {
                min = Math.min(min, sol[i - j * j] + 1);
            }
            sol[i] = min;
        }
        return sol[n];
    }

}
