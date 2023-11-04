package LastMomentBeforeAllAntsFallOutofaPlank;

public class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxTime = 0;
        for (var pos : left) {
            maxTime = Math.max(maxTime, pos);
        }
        for (var pos : right) {
            maxTime = Math.max(maxTime, n - pos);
        }
        return maxTime;
    }
}
