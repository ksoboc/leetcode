package NQueensII;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private int n;
    private int res = 0;
    private Set<Integer> col = new HashSet<>();
    private Set<Integer> posDiag = new HashSet<>();
    private Set<Integer> negDiag = new HashSet<>();
    public int totalNQueens(int n) {
        this.n=n;
        backtrack(0);
        return res;
    }

    private void backtrack(int r) {
        if (r==n)
            ++res;
        for (int c = 0; c < n; c++) {
            if (col.contains(c) || negDiag.contains(r-c) || posDiag.contains(r+c))
                continue;
            col.add(c);
            negDiag.add(r-c);
            posDiag.add(r+c);
            backtrack(r+1);
            col.remove(c);
            negDiag.remove(r-c);
            posDiag.remove(r+c);
        }
    }
}
