package NaryTreeLevelOrderTraversal;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Deque<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> row = new ArrayList<>();
            while (size-- > 0) {
                var node = queue.poll();

                if (node == null)
                    continue;
                row.add(node.val);
                if (node.children == null)
                    continue;
                for (var child :
                        node.children) {

                    if (child != null)
                        queue.offer(child);
                }

            }
            res.add(row);

        }

        return res;
    }
}

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
