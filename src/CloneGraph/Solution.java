package CloneGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    Map<Node,Node> oldToNew = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node==null)
            return null;
        return dfs(node);
    }

    private Node dfs(Node node) {
        if (oldToNew.containsKey(node))
            return oldToNew.get(node);

        var copy = new Node(node.val);
        oldToNew.put(node,copy);
        for (var nei:node.neighbors
             ) {
            copy.neighbors.add(dfs(nei));
        }
        return copy;
    }
}
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}