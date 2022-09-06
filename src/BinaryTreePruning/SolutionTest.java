package BinaryTreePruning;


import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root = arrayToTree(new Integer[]{1,null,0,0,1});
        var res = solution.pruneTree(root);


        assertArrayEquals(new Integer[]{1,null,0,null,1}, treeToArray(res));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        TreeNode root = arrayToTree(new Integer[]{1,0,1,0,0,0,1});
        var res = solution.pruneTree(root);

        assertArrayEquals(new Integer[]{1, null, 1, null, 1}, treeToArray(res));
    }

    private TreeNode arrayToTree(Integer[] array) {
        if (array.length==0)
            return null;
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int pos=1;
        while (!queue.isEmpty()) {
            TreeNode left=null;
            TreeNode right=null;
            if (pos<array.length && array[pos]!=null) {
                left=new TreeNode(array[pos]);
                queue.offer(left);
            }
            ++pos;
            if (pos<array.length && array[pos]!=null) {
                right=new TreeNode(array[pos]);
                queue.offer(right);
            }
            ++pos;

            TreeNode parent= queue.poll();
            parent.left=left;
            parent.right=right;


        }
        return root;
    }

    private Integer[] treeToArray(TreeNode root) {
        if (root==null)
            return new Integer[0];

        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node=deque.poll();
                if (node!=null)
                    list.add(node.val);
                else
                    list.add(null);
                if (node==null || (deque.isEmpty() && node.left==null && node.right==null))
                    continue;
                deque.offer(node.left);
                deque.offer(node.right);
            }

        }
        return list.toArray(new Integer[0]);
    }

}