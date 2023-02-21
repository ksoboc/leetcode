package DeleteColumnstoMakeSorted;

public class Solution {
    public int minDeletionSize(String[] strs) {
        int toDelete = 0;
        final int numCols = strs[0].length();
        for (int c = 0; c < numCols; c++) {
            char ch = strs[0].charAt(c);
            for (int r = 0; r < strs.length; r++) {
                if (strs[r].charAt(c)<ch) {
                    ++toDelete;
                    break;
                }
                ch=strs[r].charAt(c);
            }
        }
        return toDelete;
    }
}
