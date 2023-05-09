package SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int rs = 0, re = n - 1;
        int cs = 0, ce = m - 1;
        List<Integer> res = new ArrayList<>(n * m);

        while (rs <= re && cs <= ce) {
            for (int c = cs; c <= ce; c++) {
                res.add(matrix[rs][c]);
            }
            for (int r = rs + 1; r <= re; r++) {
                res.add(matrix[r][ce]);
            }
            if (re>rs) {
                for (int c = ce - 1; c >= cs; --c) {
                    res.add(matrix[re][c]);
                }
            }
            if (ce>cs) {
                for (int r = re - 1; r > rs; r--) {
                    res.add(matrix[r][cs]);
                }
            }
            ++rs;
            --re;
            ++cs;
            --ce;
        }
        return res;
    }
}
