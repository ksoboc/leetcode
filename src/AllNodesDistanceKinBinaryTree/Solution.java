package AllNodesDistanceKinBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<Integer> res = new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        distanceK(root, target, k, 0, false);
        return res;
    }

    private int distanceK(TreeNode root, TreeNode target, int k, int i, boolean seen) {
        if (root == null) return -1;
        if (root == target) {
            if (k==0) {
                res.add(root.val);
                return 0;
            } else {
                distanceK(root.left, target, k, 1, true);
                distanceK(root.right, target, k, 1, true);
                return 0;
            }
        } else {
            if (i == k&& k!=0) {
                res.add(root.val);
                return k;
            }
            if (seen) {
                if (i < k) {
                    distanceK(root.left, target, k, i + 1, true);
                    distanceK(root.right, target, k, i + 1, true);
                    return i;
                }
            } else {
                int distL = distanceK(root.left, target, k, 0, false);
                int distR = distanceK(root.right, target, k, 0, false);
                if (distL == -1 && distR == -1) return -1;
                if (distL == -1) {
                    if (distR + 1 < k) {
                        distanceK(root.left, target, k, 2 + distR, true);
                        return distR + 1;
                    } else if (distR + 1 == k) {
                        res.add(root.val);
                    }
                } else {
                    if (distL + 1 < k) {
                        distanceK(root.right, target, k, 2+distL, true);
                        return distL + 1;
                    } else if (distL + 1 == k) {
                        res.add(root.val);
                    }
                }

            }
        }
        return -1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

