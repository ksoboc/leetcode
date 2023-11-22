package DiagonalTraverseII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<Integer> diag = new ArrayList<>();
        int nrRows = nums.size();
        int maxDiag = nrRows;
        for (int r = 0; r < nrRows; r++) {
            for (int i = r; i >= 0; --i) {
                if (nums.get(i).size() > r - i)
                    diag.add(nums.get(i).get(r - i));
            }

        }
        maxDiag=nrRows-1;
        for (int r = nrRows - 1; r >= 0; --r) {
            for (int c = maxDiag-r+1; c < nums.get(r).size(); c++) {
                for (int i = r; i >= 0 ; i--) {
                    if (nums.get(i).size() > r - i+c)
                        diag.add(nums.get(i).get(r - i+c));
                }
            }
            maxDiag = Math.max(maxDiag, nums.get(r).size() + r-1);
        }
        int[] res = new int[diag.size()];
        for (int i = 0; i < diag.size(); ++i) {
            res[i] = diag.get(i);
        }
        return res;
    }
}
