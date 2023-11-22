package DiagonalTraverseII;

import java.util.*;

public class SolutionHash {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<Integer> diag = new ArrayList<>();
        Map<Integer,List<Integer>> diags = new TreeMap<>();
        int nrRows = nums.size();

        for (int r = nrRows-1; r >=0; r--) {
            for (int c = 0; c < nums.get(r).size(); c++) {
                int key = r+c;
                diags.computeIfAbsent(key,x->new ArrayList<>()).add(nums.get(r).get(c));
            }
        }

        for (int d:diags.keySet()) {
            diag.addAll(diags.get(d));
        }
        int[] res = new int[diag.size()];
        for (int i = 0; i < diag.size(); ++i) {
            res[i] = diag.get(i);
        }
        return res;
    }
}
