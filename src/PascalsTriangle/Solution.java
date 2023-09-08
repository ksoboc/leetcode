package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows==0)
            return triangle;
        var prev = List.of(1);
        triangle.add(prev);
        if (numRows==1)
            return triangle;

        for (int r = 1; r < numRows; r++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int c = 0; c < r-1; c++) {
                row.add(prev.get(c) + prev.get(c+1));
            }
            row.add(1);
            triangle.add(row);
            prev=row;
        }
        return triangle;
    }
}
