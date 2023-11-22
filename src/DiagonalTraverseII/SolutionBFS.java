package DiagonalTraverseII;

import java.util.*;

public class SolutionBFS {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<Integer> diag = new ArrayList<>();

        int nrRows = nums.size();
        Queue<int[]> queue=new LinkedList<>();

        queue.add(new int[]{0,0});
        while (!queue.isEmpty()) {
            var elem = queue.poll();
            int r=elem[0];
            int c=elem[1];
            diag.add(nums.get(r).get(c));
            if (c==0 & r+1<nrRows) {
                queue.offer(new int[]{r+1,c});
            }
            if (nums.get(r).size()>c+1) {
                queue.offer(new int[]{r,c+1});
            }
        }

        int[] res = new int[diag.size()];
        for (int i = 0; i < diag.size(); ++i) {
            res[i] = diag.get(i);
        }
        return res;
    }
}
