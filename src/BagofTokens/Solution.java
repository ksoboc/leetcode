package BagofTokens;

import java.util.Arrays;

public class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i = 0, j = tokens.length - 1;
        int score = 0;

        while (i <= j) {
            if (power >= tokens[i]) {
                power -= tokens[i++];
                ++score;
            } else {
                if (score > 0) {
                    if (j > i) {
                        power += tokens[j];
                        --score;
                    }
                    --j;
                } else
                    break;

            }

        }
        return score;
    }
}
