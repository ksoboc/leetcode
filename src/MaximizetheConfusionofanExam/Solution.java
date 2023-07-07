package MaximizetheConfusionofanExam;

public class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l = 0;
        int countT = 0;
        int countF = 0;

        int maxCons = 0;
        char[] chars = answerKey.toCharArray();
        for (int r = 0; r < chars.length; r++) {
            if (chars[r] == 'T')
                ++countT;
            else
                ++countF;
            int min = Math.min(countF, countT);
            while (min > k) {
                if (chars[l] == 'T')
                    --countT;
                else
                    --countF;
                min = Math.min(countF, countT);
                ++l;
            }
            maxCons = Math.max(maxCons, r - l + 1);
        }
        return maxCons;
    }
}
