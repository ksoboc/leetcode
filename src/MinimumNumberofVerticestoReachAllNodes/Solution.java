package MinimumNumberofVerticestoReachAllNodes;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] hasIncoming = new boolean[n];
        for (var edge : edges) {
            hasIncoming[edge.get(1)]=true;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            if (!hasIncoming[i])
                res.add(i);
        }
        return res;
    }
}
