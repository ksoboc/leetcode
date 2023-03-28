package ConstructQuadTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QuadTreeSerialization {
    public Object[][] serialize(Node root) {
        if (root == null) {
            return new Object[][]{};
        }

        List<Object[]> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            //List<Object> row = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                if (curr == null) {
                    result.add(null);
                } else {
                    if (curr.isLeaf) {
                        result.add(new Object[]{1, curr.val?1:0});
                    } else {
                        result.add(new Object[]{0, 1});
                        queue.offer(curr.topLeft);
                        queue.offer(curr.topRight);
                        queue.offer(curr.bottomLeft);
                        queue.offer(curr.bottomRight);
                    }
                }
            }
            //result.add(row);
        }

        // Convert list of lists to 2D array
        Object[][] output = new Object[result.size()][];
        for (int i = 0; i < result.size(); i++) {

            output[i] = result.get(i);
        }

        return output;
    }
}
