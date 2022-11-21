package MinimumDifficultyofaJobSchedule;

public class SolGreedy {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int surplus = jobDifficulty.length - d;
        if (surplus < 0)
            return -1;

        int minD = 0;
        int j = jobDifficulty.length - 1;
        while (surplus > 0 && j > 0) {
            int val = jobDifficulty[j];
            minD += val;
            while (j > 1 && jobDifficulty[j - 1] <= val) {
                --j;
                --surplus;
            }
            --j;
        }
        int maxV;
        if (j > 0) {
            maxV = Integer.MIN_VALUE;
            for (int i = 0; i <= j; i++) {
                maxV = Math.max(maxV, jobDifficulty[i]);
            }
        } else maxV = 0;
        return minD + maxV;
    }
}
