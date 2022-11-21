package ErectTheFence;

import java.util.*;

public class Solution {
    private int crossProduct(int[] p, int[] q, int[] r) {
        return (q[1] - p[1]) * (r[0] - q[0]) - (q[0] - p[0]) * (r[1] - q[1]);
    }

    private int distance(int[] p, int[] q) {
        return (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
    }

    private int[] bottomLeft(int[][] points) {
        int[] bottomLeft = points[0];
        for (var p : points)
            if (p[1] < bottomLeft[1])
                bottomLeft = p;
        return bottomLeft;
    }

    public int[][] outerTrees(int[][] trees) {
        if (trees.length <= 1)
            return trees;
        var bm = bottomLeft(trees);
        Arrays.sort(trees, (p, q) -> {
            var diff = crossProduct(bm, p, q) - crossProduct(bm, q, p);
            if (diff == 0) return distance(bm, p) - distance(bm, q);
            return diff > 0 ? 1 : -1;
        });
        int i = trees.length - 1;
        while (i >= 0 && crossProduct(bm, trees[trees.length - 1], trees[i]) == 0)
            i--;
        for (int l = i + 1, h = trees.length - 1; l < h; l++, h--) {
            var temp = trees[l];
            trees[l] = trees[h];
            trees[h] = temp;
        }
        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(trees[0]);
        stack.push(trees[1]);
        for (var j=2;j< trees.length;++j) {
            var top = stack.pop();
            while (crossProduct(stack.peek(), top, trees[j]) > 0)
                top=stack.pop();
            stack.push(top);
            stack.push(trees[j]);
        }
        return stack.toArray(new int[stack.size()][]);


    }
}
