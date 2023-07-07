package MaximizetheConfusionofanExam;

public class SolutionFaster {
    public int maxConsecutiveAnswers(String answerKey, int k) {
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
            if (min <= k) {
                ++maxCons;
            } else {
                if (chars[r-maxCons]=='T')
                    --countT;
                else
                    --countF;
            }
        }
        return maxCons;
    }
}
