package ReducingDishes;

import java.util.Arrays;

public class SolutionGreedy {

    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int suffix = 0;
        int maxSum = 0;

        for (int i = satisfaction.length - 1; i >= 0 && suffix+satisfaction[i] >= 0; --i) {
            suffix += satisfaction[i] ;
            maxSum += suffix;
        }
        return maxSum;
    }

}
