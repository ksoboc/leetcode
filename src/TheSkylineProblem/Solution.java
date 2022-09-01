package TheSkylineProblem;

import java.util.*;

public class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> res = new ArrayList<>();
        List<int[]> points = new ArrayList<>();
        for (var building:buildings) {
            int[] point = new int[3];
            point[0] = building[0];
            point[1] = 0;
            point[2] = building[2];
            points.add(point);
            point = new int[3];
            point[0] = building[1];
            point[1] = 1;
            point[2] = building[2];
            points.add(point);
        }

        Collections.sort(points, (a,b)->{
            int x=Integer.valueOf(a[0]).compareTo(b[0]);

            return x;
        });

        PriorityQueue<Integer> heigths = new PriorityQueue<>(Comparator.reverseOrder());
        heigths.add(0);

        int prevPos = points.get(0)[0];
        int prevHeigth = 0;
        for (var point:points) {
            if (point[0]!=prevPos) {
                if (heigths.peek()!=prevHeigth) {
                    res.add(List.of(prevPos, heigths.peek()));
                    prevHeigth=heigths.peek();
                }
                prevPos=point[0];
            }
            if (point[1]==0) {
                heigths.add(point[2]);
            } else {
                heigths.remove(point[2]);
            }
        }
        res.add(List.of(prevPos,0));
        return res;
    }
}
