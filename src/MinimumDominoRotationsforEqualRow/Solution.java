package MinimumDominoRotationsforEqualRow;

public class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {

        for (int target : new int[]{tops[0], bottoms[0]}) {
            int missingTop = 0;
            int missingBottom = 0;
            int i = 0;
            for (; i < tops.length; i++) {
                if (tops[i] != target && bottoms[i] != target)
                    break;
                if (tops[i] != target)
                    ++missingTop;
                if (bottoms[i] != target)
                    ++missingBottom;
            }
            if (i == tops.length)
                return Math.min(missingTop, missingBottom);

        }
        return -1;
    }
}
