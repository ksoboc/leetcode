package ValidateBinaryTreeNodes;

import java.util.Stack;

public class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            if (leftChild[i]!=-1) {
                ++indegree[leftChild[i]];
                if (indegree[leftChild[i]]>1)
                    return false;
            }
            if (rightChild[i]!=-1) {
                ++indegree[rightChild[i]];
                if (indegree[rightChild[i]]>1)
                    return false;
            }
        }
        int root = -1;
        for (int i = 0; i < n; i++) {
            if (indegree[i]==0) {
                if (root!=-1)
                    return false;
                root=i;
            }

        }
        if (root==-1)
            return false;
        boolean[] visited = new boolean[n];
        Stack<Integer> stack=new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            int node = stack.pop();
            if (visited[node])
                return false;
            visited[node]=true;
            if (leftChild[node]!=-1)
                stack.push(leftChild[node]);
            if (rightChild[node]!=-1)
                stack.push(rightChild[node]);
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i])
                return false;
        }
        return true;
    }
}
