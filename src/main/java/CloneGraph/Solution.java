package CloneGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Common.GraphUtil.Node;

public class Solution {
    Map<Node,Node> oldToNew = new HashMap<>();
    public Node cloneGraph(Node node) {

        return dfs(node);
    }

    private Node dfs(Node node) {
        if (node==null)
            return null;
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
